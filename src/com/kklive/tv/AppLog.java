package com.kklive.tv;

import android.util.Log;

/**
 * 
 * 便于调试的类
 * 
 */
public class AppLog {
	/**
	 * info信息
	 * 
	 * @param tag
	 * @param msg
	 */
	public static void i(String tag, String msg) {
		if (BuildConfig.DEBUG)
			Log.i(tag, msg);
	}

	/**
	 * 错误信息
	 * 
	 * @param tag
	 * @param msg
	 */
	public static void e(String tag, String msg) {
		if (BuildConfig.DEBUG)
			Log.e(tag, msg);
	}

	/**
	 * 错误信息
	 * 
	 * @param msg
	 */
	public static void e(String msg) {
		if (BuildConfig.DEBUG) {
			Log.e("test", msg);
		}
	}

	/**
	 * 错误信息
	 * 
	 * @param tag
	 * @param msg
	 * @param tr
	 */
	public static void e(String tag, String msg, Throwable tr) {
		if (BuildConfig.DEBUG)
			Log.e(tag, msg, tr);
	}

	/**
	 * 警告信息.
	 * 
	 * @param tag
	 * @param msg
	 */
	public static void w(String tag, String msg) {
		if (BuildConfig.DEBUG)
			Log.w(tag, msg);
	}

	/**
	 * 警告信息.
	 * 
	 * @param tag
	 * @param msg
	 */
	public static void w(String tag, String msg, Throwable tr) {
		if (BuildConfig.DEBUG)
			Log.w(tag, msg, tr);
	}

	/**
	 * debug信息.
	 * 
	 * @param tag
	 * @param msg
	 */
	public static void d(String tag, String msg) {
		if (BuildConfig.DEBUG)
			Log.d(tag, msg);
	}

	/**
	 * 详细信息
	 * 
	 * @param tag
	 * @param msg
	 */
	public static void v(String tag, String msg) {
		if (BuildConfig.DEBUG)
			Log.v(tag, msg);
	}
}
