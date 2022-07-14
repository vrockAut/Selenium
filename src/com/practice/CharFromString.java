//6. How to count the occurrence of the given character in a string?

package com.practice;

public class CharFromString {
	public static void main(String[] args) {
		String name = "Automation Engineers";
		int count =0;
		char ch;
		System.out.println("----------------------------");
		for (int i = 0; i < name.length(); i++) {
			ch =name.charAt(i);
			count++;
			System.out.println(ch);
		}
		System.out.println("----------------------------");
		System.out.println("Total Digits in a String is :"+count);
	}
}
