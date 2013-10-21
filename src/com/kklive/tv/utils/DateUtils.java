package com.kklive.tv.utils;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressLint("SimpleDateFormat")
public class DateUtils{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	
	public static String GetNowDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
	
	public static Date str2Date(String paramString){
		Date date = null;
		try {
			date = sdf.parse(paramString);
		} catch (Exception e) {
		}
		return date;
	}
}
