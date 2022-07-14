package practice;

public class NonStaticMethodPractice {
	public static void main(String[] args) {
//		Create an Object of a current class
		NonStaticMethodPractice nsmp = new NonStaticMethodPractice();
//		Using object We can Call Nonstatic method
		nsmp.addition();
	}
//	Non Static Regular Method 
	public void addition() {
		int add=10+20;
		System.out.println("Addtion : "+add);
	}
}
