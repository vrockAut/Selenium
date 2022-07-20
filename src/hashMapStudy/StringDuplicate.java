package hashMapStudy;

import java.util.HashMap;
import java.util.Set;

public class StringDuplicate {
	public static void main(String[] args) {
		String a= "java java ruby python DotNet DotNet python";
		String arr[] = a.split(" ");
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String l:arr) {
			String str =l;
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		Set<String> keys =map.keySet();
		for(String k:keys) {
			System.out.println(k+ " language are "+map.get(k)+" times.");
		}
//		System.out.println(keys);
		System.out.println("Thank You.....!!!!");
	}
}
