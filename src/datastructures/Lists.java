package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("San Jose");
		cities.add("Cupertino");
		cities.add("Saratoga");
		cities.add("Wala Wala");
		
		for (String city : cities) {
			System.out.println(city);
		}
		
		int size = cities.size();
		
		System.out.println(cities.get(3));
		
		cities.remove(2);
		for (String city : cities) {
			System.out.println(city);
		}

	}

}
