package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> animals = new LinkedHashSet<String>();
		
		animals.add("dog");
		animals.add("cat");
		animals.add("chicken");
		animals.add("horse");
		animals.add("camel");
		
		System.out.println(animals);
		
		Set<String> farmAnimals = new TreeSet<String>();
		
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("chicken");
		farmAnimals.add("dog");
		farmAnimals.add("octopus");
		
		System.out.println(farmAnimals);
		
		Set<String> intersectionSet = new HashSet<String>(animals);
		
		System.out.println(intersectionSet);
		
		intersectionSet.retainAll(farmAnimals);
		
		System.out.println(intersectionSet);
		
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		
		unionSet.addAll(animals);
		
		System.out.println(unionSet);

		Set<String> differenceSet = new HashSet<String>(animals);
		
		differenceSet.remove(farmAnimals);
		
		System.out.println(differenceSet);
		
		


	}

}
