package com.example.secuber.curve102.PKG;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.secuber.curve102.Curve102.Curve102;
import com.example.secuber.curve102.ecc.EccNum;
import com.example.secuber.curve102.secure.Encrypter;
import com.example.secuber.curve102.util.Base64;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.content.Context.MODE_PRIVATE;

public class KeyManager {

    public static Context context;

    public static final String TAG = KeyManager.class.getSimpleName();

    private static byte[] s;

    public static byte[] generateS() {
        EccNum random = EccNum.generateRandomNum();
        byte[] out = new byte[16];
        random.getBytes(out);
        return out;
    }

    public static void saveS(byte[] s, String passwd) {
//		try {
        // encrypt
        String tmp = "Key:" + Base64.encodeBytes(s);
        String encTmp = Encrypter.ecnrypt(tmp, passwd);

        writeFileData("keys", encTmp);

//			BufferedWriter fout = new BufferedWriter(new FileWriter("keys"));
//			fout.write(encTmp);
//			fout.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    }


    public static void writeFileData(String filename, String content) {

        try {
            FileOutputStream fos = context.openFileOutput(filename, MODE_PRIVATE);
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static String readFileData(String fileName) {

        String result = "";

        try {
            FileInputStream fis = context.openFileInput(fileName);
            int lenght = fis.available();
            byte[] buffer = new byte[lenght];
            fis.read(buffer);
            result = new String(buffer, "UTF-8");
            fis.close();
        } catch (Exception e) {
             e.printStackTrace();
        }

        return result;
    }


    public static byte[] loadS(String passwd) throws InvalidMainPasswdException
    {
        byte[] res = new byte[16];
        try {
//			BufferedReader fin = new BufferedReader(new FileReader("keys"));
            String encTmp = readFileData("keys");
//			encTmp = fin.readLine();
//			fin.close();


            // decrypt
            encTmp = Encrypter.decrypt(encTmp, passwd);
            String[] tmp = encTmp.split(":");
            if (tmp.length == 2 && "Key".equals(tmp[0])) {
                byte[] buffer = Base64.decode(tmp[1]);
                System.arraycopy(buffer, 0, res, 0, 16);
            } else {
                throw new InvalidMainPasswdException("Wrong Main Key");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void initKeyManager(String passwd, Context con) throws InvalidMainPasswdException
    {
        try {
            context = con;
            FileInputStream fis = context.openFileInput("keys");
            fis.close();
            s = loadS(passwd);
            System.out.println("s=" + s);
        } catch (FileNotFoundException e) {
            System.err.println("not found file 'keys'");
            s = generateS();
            saveS(s, passwd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initKeyManager(Context con)
    {
        context = con;
    }

    public static synchronized String getPrivateKeyFromId(String id)
    {
        try {
            s =Base64.decode("2QTK5AA+uv8Pent6dSZkp9rBSmp3QL8kn84Pzw70LNs=");
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] publicKey = Curve102.getInstance("java").publicKeyFromId(id).getBytes();
        byte[] privateKey = Curve102.getInstance("java").privateKeyFromPublicKey(publicKey, s).getBytes();
        return Base64.encodeBytes(privateKey);
    }

    public static byte[] getPrivate() throws InvalidMainPasswdException {
        byte[] buffer = new byte[0];
        try {
            FileInputStream fis = context.openFileInput("private");
            int lenght = fis.available();
             buffer = new byte[lenght];
            fis.read(buffer);
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("not found file 'keys'");
            //String id = RongIM.getInstance().getCurrentUserId();
            String id="1111";
            String priva = getPrivateKeyFromId(id);
            writeFileData("private",priva);
            buffer=priva.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return android.util.Base64.decode(buffer, android.util.Base64.DEFAULT);
    }

    public static byte[] getPrivate2()
    {
        SharedPreferences sp = context.getSharedPreferences("config",MODE_PRIVATE);
        String PrvKey = sp.getString("privateKey","");
        byte[] privateKeysBytes = android.util.Base64.decode(PrvKey, android.util.Base64.DEFAULT);
        return privateKeysBytes;
    }

}
