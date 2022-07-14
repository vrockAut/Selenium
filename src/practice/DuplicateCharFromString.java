package practice;

import java.util.Arrays;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		String str = "automation";
		char ch[] =str.toCharArray();
		char a[]=new char[ch.length];
		int index=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
//					System.out.println("Duplicates are : "+ch[i]);
					a[index]=ch[i];
					index++;					
				}
			}
		}
		System.out.println("Orignal String array ");
		System.out.println(Arrays.toString(ch));
		System.out.println("Duplicates Arrays: ");
		System.out.println(Arrays.toString(a));
//		for(int l=0;l<ch.length;l++) {
//				System.out.print(a[l]+",");
//		}
		
	}
}
