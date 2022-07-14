package com.practice;

public class StringAADDSS {
	public static void main(String[] args) {
		String str = "AAADDDCCCA";
		char ch;
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					ch=str.charAt(j);
					count++;
					System.out.println(" ");
					
				}
			}
		}
		System.out.println("Count "+count);
	}
}
