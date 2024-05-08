package week6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsListConcept {

	public static void main(String[] args) {

	
		Set<Integer> names= new HashSet<Integer>();
		
		names.add(1);
		names.add(3);
		names.add(3);
		
		names.add(6);
		
		names.add(3);
		
		names.add(4);
		
		
		int size = names.size();
		
		System.out.println(size);
		
		names.remove(1);
		
	
		
		
		System.out.println(names);
		
		
		
		
		
	}

}
