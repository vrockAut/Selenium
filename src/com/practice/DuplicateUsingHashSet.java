package com.practice;

import java.util.LinkedHashSet;

public class DuplicateUsingHashSet {
	public static void main(String[] args) {
		String str = "automation";
		char ch[] = str.toCharArray();
		
//		HashSet<Character> hs = new HashSet<>();
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for (char n : ch) {
			lh.add(n);
		}
		System.out.println(lh);
	}
}
