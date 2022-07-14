//How to check if a string is a palindrome?

package com.practice;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check the String Is Palindrome or Not! : ");
		String name = sc.next(), rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		if (rev.equals(name)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Not A Palindrome!!!");
		}
	}
}
