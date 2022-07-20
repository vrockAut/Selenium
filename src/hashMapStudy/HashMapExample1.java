package hashMapStudy;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		String a="abcbabcdbabcbd";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<=a.length()-1;i++) {
			char charValue =a.charAt(i);
//			System.out.print(charValue+" ");
			if(map.containsKey(charValue)) 
			{
				map.put(charValue,map.get(charValue)+1);
			}
			else
			{
				map.put(charValue, 1);
			}
		}	
//		System.out.println(map);
		Set<Character> keys = map.keySet();
		for(Character k:keys) {
			System.out.println(k+"-->"+map.get(k));
		}
	}

}
