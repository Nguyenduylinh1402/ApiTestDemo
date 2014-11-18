package com.linhnguyen.test;

import android.util.Log;

public class Logger {

	public static void d(final String tag, final String message) {
		System.out.println(tag + ": " + message);
		Log.d(tag, message);
	}

}