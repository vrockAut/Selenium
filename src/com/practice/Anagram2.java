//4. How to check if two strings are anagrams of each other?
//We can say if two strings are an anagram of 
//each other if they contain the same characters but at different orders.
//Ex. army & mary

package com.practice;

import java.util.Scanner;

public class Anagram2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String :");
		String str1 = sc.next();
		System.out.println("Enter the Second String :");
		String str2 = sc.next();
		boolean flag=false;
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<str1.length();j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						flag=true;
					}
				}
			}
			if(flag==true) {
				System.out.println("The Two Strings are Anagram");
			}
				else {
					System.out.println("The Two Strings are Not Anagram");
			}
		}
	}
}
