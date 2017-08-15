package com.lance.util;

public class StringUtils {
	public static boolean isEmpty(String str) {
		return null == str || str.equals("") || str.matches("\\s*");
	}
}
