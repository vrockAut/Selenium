package hashMapStudy;

import java.util.HashMap;
import java.util.Set;

public class UsingHashMapCountNumberFromArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,2,3,4,3,2,3,4,5,6,3,4,2,2,1,5,5,6,6,3,4,4};
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for(int i=0;i<=a.length-1;i++) {
			int number=a[i];
//			System.out.println(a[i]);
			if(map.containsKey(a[i])) {
				map.put(number, map.get(number)+1);
			}
			else {
				map.put(number,1);
			}
		}
		Set<Integer> keys =map.keySet();
		for(Integer k : keys) {
			System.out.println(k+"-->"+map.get(k));
		}
	}
}
