package com.practice;

public class ReverseString {
	public static void main(String[] args) {

		String input = " The string with the reverse word is :";
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Orignal : " + input);
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}
}
