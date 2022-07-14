package practice;

import java.util.Arrays;
import java.util.HashSet;

//How to print duplicate characters from the string?

public class DuplicateFromString {
	public static void main(String[] args) {
		String a[] = { "vinod", "raj", "jignesh", "mahesh", "ronit", "vinod", "ronit" };
		try {
			HashSet<String> hs = new HashSet<>();
			for (String h : a) {
				hs.add(h);
			}
			System.out.println(Arrays.toString(a));
			System.out.println(hs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int index = 0;
		String b[] = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
//					System.out.println(a[i]);
					b[index] = a[i];
					index++;
				}
			}
		}
//		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<a.length;i++) {
			if(b[i]==null) {
				System.out.print("");
			}
			else {
				System.out.print(b[i]+" ");
			}
		}
	}
}
