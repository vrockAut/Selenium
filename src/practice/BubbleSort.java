package practice;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {4,2,1,5,3};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
