package com.interview.programs;

public class FindVowelsInWord {
	
	public static void main(String[] args) {
		
		String str = "hello";
		System.out.println("Is vowel: "+isVowelsPresent(str));
		
	}
	
	static boolean isVowelsPresent(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}

}
