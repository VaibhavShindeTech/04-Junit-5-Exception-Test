package com.vaibhavtech.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.vaibhavtech.StringUtils;

public class TestStringUtils {
	@Test
	public void testStringToInteger1() {
		String str = null;
		assertThrows(IllegalArgumentException.class, () -> StringUtils.stringToInteger(str));
	}

	@Test
	public void testStringToInteger2() {
		String str = "10";
		Integer actual = StringUtils.stringToInteger(str);
		assertEquals(actual, 10);
	}

}
