package com.practice;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N : ");
		int n = sc.nextInt();
		System.out.println("Enter the Value of k : ");
		int k = sc.nextInt();
		int temp = n, count = 0;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		System.out.println("Total Digits : " + count);
		int div = 1, mult = 1;
		for (int i = 0; i < count; i++) {
			if (i < k) {
				div *= 10;
			} else {
				mult *= 10;
			}
		}
		int q = n / div;
		System.out.println(q);
		int r = n % div;
		System.out.println(r);
		int result = (r * mult) + q;
		System.out.println(result);
	}

}
