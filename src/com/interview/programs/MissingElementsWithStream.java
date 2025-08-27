package com.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElementsWithStream {

	public static void main(String[] args) {

		int[] num = { 1, 1, 2, 2, 3, 4, 6, 8, 9 };

		Set<Integer> intSet = Arrays.stream(num).boxed().collect(Collectors.toSet());

		List<Integer> missingElements = IntStream.rangeClosed(1, 9).boxed().filter(i -> !intSet.contains(i))
				.collect(Collectors.toList());

		System.out.println(missingElements);
	}

}
