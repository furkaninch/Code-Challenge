package com.s4dx.testcase;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.s4dx.logic.*;

@RunWith(Parameterized.class)
public class MultipleRunTest {

	@Test
	public void testFind() {

		String[] thisIsAStringArray = new String[5];
		thisIsAStringArray[0] = "asd";
		thisIsAStringArray[1] = "asdd";
		thisIsAStringArray[2] = "fre";
		thisIsAStringArray[3] = "glk";
		thisIsAStringArray[4] = "lkm";

		String[] expectedArray = new String[5];
		expectedArray[0] = "asd";
		expectedArray[1] = "asdd";

		assertArrayEquals(expectedArray, new Finder(thisIsAStringArray).find("sad"));
	}
	
	@Parameters
	public static Object[][] data()  {
		return new Object [50000][0];
	}
}
