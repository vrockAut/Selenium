//How to convert an array to string in Java?

package com.practice;

import java.util.Arrays;

public class ArrayDigit {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 65, 65, 65 };
		String convert = Arrays.toString(a);
		System.out.println(convert);
	}
}