package com.vaibhavtech;

public class StringUtils {
	public static Integer stringToInteger(String str) {
		if (str == null || str.trim().length() == 0) {
			throw new IllegalArgumentException("String should not be null or empty");
		}
		int num = Integer.valueOf(str);
		return num;
	}
}
