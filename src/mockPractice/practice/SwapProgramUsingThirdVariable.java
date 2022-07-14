package mockPractice.practice;

import java.util.Scanner;

public class SwapProgramUsingThirdVariable {
	Scanner sc = new Scanner(System.in);
	int a, b, c;

	public SwapProgramUsingThirdVariable() {
		System.out.println("Enter the Value Of a : ");
		a = sc.nextInt();
		System.out.println("Enter the Value of b : ");
		b = sc.nextInt();
		System.out.println("A : "+a+" AND B : "+b);
		System.out.println("--------------------------------");
	}

	public void swap() {
		c=a;
		a=b;
		b=c;
		System.out.println("After Swap");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("A : "+a+" AND B : "+b);
		System.out.println("--------------------------------");
	}
	public static void main(String[] args) {
		SwapProgramUsingThirdVariable spu = new SwapProgramUsingThirdVariable();
		spu.swap();
	}
}
