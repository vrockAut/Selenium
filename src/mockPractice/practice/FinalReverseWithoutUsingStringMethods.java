//Q #1) Write a Java Program to reverse 
//a string without using String inbuilt function.

package mockPractice.practice;

import java.util.Scanner;

public class FinalReverseWithoutUsingStringMethods {
	Scanner sc = new Scanner(System.in);
	String str, rev = "";

	public FinalReverseWithoutUsingStringMethods() {
		System.out.println("Enter the String : ");
		str = sc.next();
	}

	public void reverse() {
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reverse String : " + rev);
	}

	public void pali() {
		if (rev.equals(str)) {
			System.out.println("Given String Is Palindrom");
		} else {
			System.out.println("Given String Is Not a Palindrom");
		}
	}

	public static void main(String[] args) {
		FinalReverseWithoutUsingStringMethods fr = new FinalReverseWithoutUsingStringMethods();
		fr.reverse();
		fr.pali();
	}

}
