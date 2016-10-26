package com.sojourner6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompressString {

	@Test
	public void test() {
		assertEquals("abd", CompressString.reduceString("", "aaabccddd"));
		System.out.println();
		assertEquals("Empty String", CompressString.reduceString("", "baab"));
		System.out.println();
		assertEquals("Empty String", CompressString.reduceString("", "aa"));
	}

}
