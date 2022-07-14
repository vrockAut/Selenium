//How to check if two strings are the same ignoring their cases
package com.practice;

public class CheckEqualsStringArray {
	public static void main(String[] args) {
		String str1="vinod";
		String str2="VINOD";
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Both Strings Are Equals");
		}
	}
}
