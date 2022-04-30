package com.s4dx.logic;

public class Finder {

	String[] arrayToSearch;

	public Finder(String[] arrayToSearch) {
		this.arrayToSearch = arrayToSearch;
	}

	public String[] find(String target) {
		if (arrayToSearch == null)
			return new String[] {};

		String[] foundedStrings = new String[arrayToSearch.length];

		aa: for (int i = 0; i < arrayToSearch.length; i++) {
			String stringOfArray = arrayToSearch[i];
			if (stringOfArray == null)
				continue;
			for (char ch : target.toCharArray()) {
				if (stringOfArray.indexOf(ch) == -1)
					continue aa;
				else {
					// changing to founded index because there might be multiple same chars
					// in given target string and we don't want them to find same char
					int index = stringOfArray.indexOf(ch);
					stringOfArray = stringOfArray.substring(0, index) + "-1" + stringOfArray.substring(index + 1);
				}
			}
			foundedStrings[i] = arrayToSearch[i];
		}

		return foundedStrings;
	}

}
