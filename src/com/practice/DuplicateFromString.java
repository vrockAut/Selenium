package com.practice;
//How to print duplicate characters from the string?

public class DuplicateFromString {
	public static void main(String[] args) {
		String a[] = {"vinod","raj","jignesh","mahesh","ronit","vinod","ronit"};
		
		int count = 0;
		for (int i = 0; i < a.length-1; i++) { //len =7-1=6
			for (int j = i+1; j< a.length; j++) {//len =7
				if (a[i].equals(a[j])) {
					count++;
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("Dublicates String " + count);
	}
}
