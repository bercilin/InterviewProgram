package com.interview.programs;

import java.util.HashMap;
import java.util.Map;

public class Occurences {

	public static void main(String[] args) {

		int[] input = { 1, 2, 2, 3, 3, 4 };

		Map<Integer, Integer> occurences = new HashMap<>();
		for (int i = 0; i <= input.length - 1; i++) {
			if (occurences.containsKey(input[i])) {
				occurences.put(input[i], occurences.get(input[i]) + 1);
			} else {
				occurences.put(input[i], 1);

			}

		}
		
		System.out.println(occurences);

	}

}
