package com.practice;

public class ReverserString {
	public static void main(String[] arg) {
		String str = "12345678", rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		int num = Integer.parseInt(rev.toString()), sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
			System.out.println("Sum : " + sum);
		}
		System.out.println("Sum Of Digits is : " + sum);
	}
}
