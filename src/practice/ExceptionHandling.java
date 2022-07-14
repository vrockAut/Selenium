package practice;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		int a =10,b=0;
		
		try {
			System.out.println(a/b);//risky Code
		}catch(ArithmeticException e) {
			System.out.println("Number is not divisible by 0 ..");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		String str="abc";
		String str2 =null;
		try {
			System.out.println(str.charAt(10));
		}
		catch(NullPointerException e) {
			System.out.println("String value Should not null");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index will be Invalid");
		}
	}
}
