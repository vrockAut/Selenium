package mockPractice.practice;

import java.util.ArrayList;

public class ArrayListStudy {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-4);
		list.add(1);
		list.add(3);
		list.add(5);
		ArrayList<Integer> relist = new ArrayList<>();
		int num=5,sum=0;
		for(int i=0;i<list.size();i++) {
			int temp = num+list.get(i);//tem=5+(-4)=1=1+1=2+3=5+5=10
			num=temp;//num=1//2//5//10
			relist.add(temp);//1,2,5,10
		}
		System.out.println(relist);
		for(int j=0;j<relist.size();j++) {
			sum+=relist.get(j);
		}
		System.out.println("Addition : "+sum);
	}
}
