//How to swap two strings without using the third variable?

package com.practice;

public class Swap2String {
	public static void main(String[] args) {

		String first = "one", second = "two", temp = "";
		System.out.println(first+"\t"+second);
		temp = first;
		first = second;
		second=temp;
		System.out.println(first+" \t"+second);
	}
}
