package allTestClasses;

public class TestCase1 {
	public static void main(String[] args) {
		int a=10,b=20,c=0;
		System.out.println("Orignal Digits..");
		System.out.println(a+"\t"+b);
		System.out.println("Swaped Digits...");
		c=a;
		a=b;
		b=c;
		
		System.out.println(a+"\t"+b);
	}
}
