package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		mapUtil(hMap);
	}
	
	public static void mapUtil(Map<Integer, String> map) {
		map.put(101, "Steve");
		map.put(510, "Ed");
		map.put(233, "Tom");
		map.put(17, "Homer");
		map.put(432, "Bob");
		
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all the key-value pairs: " + map);
		
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}

	}

}
