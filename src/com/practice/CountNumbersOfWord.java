//How to count the number of words in a given string sentence?

package com.practice;

public class CountNumbersOfWord {
	public static void main(String[] args) {
		String language ="java,ruby,python,javascreept,html";
		String arr[]=language.split(",");
		int count=0;
		char ch = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			count++;
		}
		System.out.println("Total Words In the Strings are : "+count);
	}
}
