package com.s4dx.testcase;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.s4dx.logic.*;

public class LargeInitArrayTest {

	@Test
	public void testFind() {

		String[] thisIsAStringArray = new String[1000000];
		List<String> givenList = Arrays.asList("abc", "dser", "asgh", "cha", "cze");
		Random rand = new Random();
		
		for(int i = 0 ; i < 999999 ; i++) {
			thisIsAStringArray[i] = givenList.get(rand.nextInt(givenList.size()));
		}
		thisIsAStringArray[999999] = "final";

		String[] expectedArray = new String[1000000];
		expectedArray[999999] = "final";

		assertArrayEquals(expectedArray, new Finder(thisIsAStringArray).find("lnfia"));
	}
}
