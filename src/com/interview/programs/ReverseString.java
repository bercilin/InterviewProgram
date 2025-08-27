package com.interview.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println("After reversed: " + reverse(str));

	}

	static String reverse(String str) {

		char[] charString = str.toCharArray();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = charString.length - 1; i >= 0; i--) {
			strBuilder.append(charString[i]);
		}
		return strBuilder.toString();
	}

}
