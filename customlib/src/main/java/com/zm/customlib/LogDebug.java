package com.zm.customlib;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "APP";

    public static void d(String msg) {
        Log.d(TAG, msg);
    }
}
