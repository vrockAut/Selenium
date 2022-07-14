//4. How to check if two strings are anagrams of each other?
//We can say if two strings are an anagram of 
//each other if they contain the same characters but at different orders.
//Ex. army & mary

package com.practice;

public class Anagrams {
	public static void main(String[] args) {
		boolean flag = false;
		String str1 = "army";// 4
		String str2 = "mary";
		if (str1.length() == (str2.length())) {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str1.length(); j++) {
					if (str1.charAt(i) == (str2.charAt(j))) {
						flag = true;
					}
				}
			}
		}
		if (flag == true) {
			System.out.println("Two Strings are anagrams");
		}
		else {
			System.out.println("Two Strings are Not anagrams");
		}
	}
}
