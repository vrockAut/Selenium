package mockPractice.practice;

import java.util.Scanner;

public class SwapNumberWithoutVariable {
	Scanner sc = new Scanner(System.in);
	int a, b;
	public SwapNumberWithoutVariable() {
		System.out.println("Enter the Value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the Value of b : ");
		b = sc.nextInt();
		System.out.println("Orignal Numbers ");
		System.out.println("-------------------------");
		System.out.println("A : "+a+ "- B : "+b);
		System.out.println("-------------------------");
	}
	public void Swap() {
		a=a+b;//a=10+20=30
		b=a-b;//b=30-20=10
		a=a-b;//a=30-10=20
		System.out.println("After Swap");
		System.out.println("-------------------------");
		System.out.println("A : "+a+ "- B : "+b);
	} 
	public static void main(String[] args) {
		SwapNumberWithoutVariable sw = new SwapNumberWithoutVariable();
		sw.Swap();
	}

}
