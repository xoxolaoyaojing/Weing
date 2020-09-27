package com.example.secuber.libibcaxolotl.secure;

import android.content.Context;

import com.example.secuber.libibcaxolotl.IncorrectPrvKeyStateException;
import com.example.secuber.libibcaxolotl.PrvKeyPreferences;

/**
 * Created by xkey on 2017/7/4.
 */
public class PrvKey extends WeingKey {

    private static  Context context;
    private static PrvKeyState state = PrvKeyState.PRVKEY_STATE_EMPTY;
    public static String strTagEmpty = "state_prvkey_empty";
    public static String strTagGenerating = "state_prvkey_generating";
    public static String strTagActivity = "state_prvkey_activity";
    public static String strTagDeleting = "state_prvkey_deleting";
    public static String strTagUpdating = "state_prvkey_updating";

    private PrvKey() {
        this.context = null;
    }

    /**
     * Constructor with a key received from server.
     * @param key
     */
    public PrvKey(Context context, String key) {
        super(key);
        this.context = context;
        renewState();
    }

    /**
     * Default constructor.
     */
    public PrvKey(Context context) {
        this.context = context;
        renewState();
    }

    /**
     * Renew state.
     */
    private void renewState() {
        String strPrvKeyState = PrvKeyPreferences.getPrvkeyStatePref(context);
        if(strPrvKeyState.equals(strTagEmpty)) {
            state = PrvKeyState.PRVKEY_STATE_EMPTY;
        } else if(strPrvKeyState.equals(strTagGenerating)) {
            state = PrvKeyState.PRVKEY_STATE_GENERATING;
        } else if(strPrvKeyState.equals(strTagActivity)) {
            state = PrvKeyState.PRVKEY_STATE_ACTIVITY;
        } else if(strPrvKeyState.equals(strTagUpdating)) {
            state = PrvKeyState.PRVKEY_STATE_UPDATING;
        } else if(strPrvKeyState.equals(strTagDeleting)) {
            state = PrvKeyState.PRVKEY_STATE_DELETING;
        }
    }

    // get private key from preferences
    public String getPrvKey() throws IncorrectPrvKeyStateException {
        if(state != PrvKeyState.PRVKEY_STATE_ACTIVITY)
            throw new IncorrectPrvKeyStateException("Get prvivate key must be PRVKEY_STATE_ACTIVITY!");
        return PrvKeyPreferences.getPrvkeyValuePref(context);
    }

    // start getting prvkey
    public void gettingPrvKey() throws IncorrectPrvKeyStateException{
        state.getPrvKeyFromServer();
    }

    // start updating prvkey
    public void updatingPrvKey() throws IncorrectPrvKeyStateException {
        state.update();
    }

    // set prvkey
    public void setPrvKey(String prvKey) throws IncorrectPrvKeyStateException {
        state.successed();
        PrvKeyPreferences.setPrvkeyValuePref(context, prvKey);
    }

    // start deleting prvkey
    public void deletePrvKey() throws IncorrectPrvKeyStateException {
        state.delete();
        // TODO: implements deleting private key
    }

    // getting, updating or deleting failed
    public void failed() throws IncorrectPrvKeyStateException {
        state.faild();
    }

    enum PrvKeyState {
        PRVKEY_STATE_EMPTY {
            public void getPrvKeyFromServer() {
                state = PRVKEY_STATE_GENERATING;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagGenerating);
            }
            public void update() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("update private key  must be PRVEKEY_STATE_EMPTY");
            }
            public void delete() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("delete private key from server must be PRVEKEY_STATE_ACTIVITY");
            }
            public void successed() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("received a unexpected signal");
            }
            public void faild() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("received a unexpected signal");
            }
        },
        PRVKEY_STATE_GENERATING {
            public void getPrvKeyFromServer() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("get private key from server must be PRVEKEY_STATE_EMPTY");
            }
            public void update() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("update private key  must be PRVEKEY_STATE_EMPTY");
            }
            public void delete() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("delete private key from server must be PRVEKEY_STATE_ACTIVITY");
            }
            public void successed() {
                state = PRVKEY_STATE_ACTIVITY;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagActivity);
            }
            public void faild() {
                state = PRVKEY_STATE_EMPTY;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagEmpty);
            }
        },
        PRVKEY_STATE_ACTIVITY {
            public void getPrvKeyFromServer() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException();
            }
            public void update() {
                state = PRVKEY_STATE_UPDATING;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagUpdating);
            }
            public void delete() {
                state = PRVKEY_STATE_DELETING;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagDeleting);
            }
            public void successed() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("received a unexpected signal");
            }
            public void faild() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("received a unexpected signal");
            }
        },
        PRVKEY_STATE_UPDATING {
            public void getPrvKeyFromServer() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("get private key from server must be PRVEKEY_STATE_EMPTY");
            }
            public void update() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("update private key  must be PRVEKEY_STATE_EMPTY");
            }
            public void delete() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("delete private key from server must be PRVEKEY_STATE_ACTIVITY");
            }
            public void successed() {
                state = PRVKEY_STATE_ACTIVITY;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagActivity);
            }
            public void faild() {
                state = PRVKEY_STATE_UPDATING;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagUpdating);
            }
        },
        PRVKEY_STATE_DELETING {
            public void getPrvKeyFromServer() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("get private key from server must be PRVEKEY_STATE_EMPTY");
            }
            public void update() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("update private key  must be PRVEKEY_STATE_EMPTY");
            }
            public void delete() throws IncorrectPrvKeyStateException {
                throw new IncorrectPrvKeyStateException("delete private key from server must be PRVEKEY_STATE_ACTIVITY");
            }
            public void successed() {
                state = PRVKEY_STATE_EMPTY;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagEmpty);
            }
            public void faild() {
                state = PRVKEY_STATE_DELETING;
                PrvKeyPreferences.setPrvkeyStatePref(context,strTagDeleting);
            }
        };
        abstract public void getPrvKeyFromServer() throws IncorrectPrvKeyStateException;
        abstract public void update()throws IncorrectPrvKeyStateException;
        abstract public void delete()throws IncorrectPrvKeyStateException;
        abstract public void successed()throws IncorrectPrvKeyStateException;
        abstract public void faild()throws IncorrectPrvKeyStateException;
    }
}
