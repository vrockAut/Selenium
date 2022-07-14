//How to convert string to integer?

package com.practice;

public class ConvertStringToInt {
	public static void main(String[] args) {
		String str= "2022";
		int num =Integer.parseInt(str.toString());
		num++;
		System.out.println("Number : "+num);
	}

}
