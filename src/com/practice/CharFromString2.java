package com.practice;

import java.util.Scanner;

public class CharFromString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String....!!");
		String str = sc.next(),rev="";
		char ch;
		int count = 0;
		for (int i =str.length()-1; i >=0 ; i--) {
			ch = str.charAt(i);
			rev+=ch;
			count++;
			System.out.println("Char is : "+ch);
		}
		int reverse = Integer.parseInt(rev.toString());
		reverse++;
		System.out.println("Incersing Num Is : "+reverse);
		System.out.println("Total Char are : "+count);
	}
}
