package com.example.secuber.libibcaxolotl;

import android.content.Context;

/**
 * Created by xkey on 2017/8/16.
 */
public class PrvKeyPreferences extends WeingPreferences {
    private static final String PRVKEY_STATE_PREF = "pref_prvkey_state";
    private static final String PRVKEY_VALUE_PREF = "pref_prvkey_value";
    public static final String PRVKEY_STATE_EMPTY = "state_prvkey_empty";
    public static final String PRVKEY_VALUE_EMPTY = "value_prvkey_empty";

    public static void setPrvkeyStatePref(Context context, String state) {
        setStringPreference(context, PRVKEY_STATE_PREF, state);
    }

    public static String getPrvkeyStatePref(Context context) {
        return getStringPreference(context, PRVKEY_STATE_PREF, PRVKEY_STATE_EMPTY);
    }

    public static void setPrvkeyValuePref(Context context, String value) {
        setStringPreference(context, PRVKEY_VALUE_PREF, value);
    }

    public static String getPrvkeyValuePref(Context context) {
        return getStringPreference(context, PRVKEY_VALUE_PREF, PRVKEY_VALUE_EMPTY);
    }

    public static void deletePrvKeyStatePref(Context context) {
        deletePreference(context, PRVKEY_STATE_PREF);
    }

    public static void deletePrvKeyValuePref(Context context) {
        deletePreference(context, PRVKEY_VALUE_PREF);
    }
}
