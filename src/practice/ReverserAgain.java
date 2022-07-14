package practice;

public class ReverserAgain {
	public static void main(String[] args) {
		String s1 = "Tester";
		System.out.println("Orignal String : " + s1);
		System.out.println("Reverse String ");
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i) + " ");
		}
	}
}
