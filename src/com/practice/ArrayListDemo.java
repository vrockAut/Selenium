package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList sample = new ArrayList();
		System.out.println("Enter The ArrayList Value :");
		for (int i = 0; i < 10; i++) {
			Object a = sc.next();
			sample.add(a);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(sample.get(i) + " ");
		}
	}
}
