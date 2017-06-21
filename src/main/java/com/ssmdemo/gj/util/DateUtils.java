package com.ssmdemo.gj.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/**
 * Date常用工具类
 * @author GuoJie
 *
 */
public class DateUtils {
	/**
	 * 转换时间为某一区时间
	 * @param pattern 例如:"yyyy-MM-dd"
	 * @param date
	 * @param timeZone 时区:"GMT+8"
	 * @return
	 */
	public static String convertDateToString(String pattern, Date date,String timeZone) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		TimeZone tZone = TimeZone.getTimeZone(timeZone);
		String strDate = null;
		try {
			sdf.setTimeZone(tZone);
			strDate = sdf.format(date);
		} catch (Exception e) {
			e.getMessage();
		}
		return strDate;
	}
	
	public static Date stringToDate(String str,String formatstr) {
		DateFormat format = new SimpleDateFormat(formatstr);
		Date date = null;
		try {
			// Fri Feb 24 00:00:00 CST 2012
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 2012-02-24
		date = java.sql.Date.valueOf(str);
		return date;
	}

	public static Timestamp dateToTimestamp(Date date){
		return new Timestamp(date.getTime());
	}
	
}
