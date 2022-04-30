package com.s4dx.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.s4dx.logic.*;

public class TestLogic {

	@Test
	public void testFind() {

		String[] thisIsAStringArray = new String[5];
		thisIsAStringArray[0] = "asd";
		thisIsAStringArray[1] = "asdd";
		thisIsAStringArray[2] = "fre";
		thisIsAStringArray[3] = "glk";
		thisIsAStringArray[4] = "lkm";

		String[] expectedArray = new String[5];
		expectedArray[1] = "asdd";

		assertArrayEquals(expectedArray, new Finder(thisIsAStringArray).find("dsad"));
	}
}
