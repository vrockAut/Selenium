package practice;

public class MethodStudy {
	public static void main(String[] args) {
		addition();
		MethodStudy ms = new MethodStudy();
		ms.sub();
		MethodStudyPart2 msp = new MethodStudyPart2();
		msp.multi();
		MethodStudyPart2.div();

	}
//	Static Method--Regular
	public static void addition() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addtion of Two Numbers Is : "+sum);
	}
//	Non Static Regular Method
	public void sub() {
		int p=30;
		int q=20;
		int sub1=p-q;
		System.out.println("Substraction : "+sub1);
	}
}
