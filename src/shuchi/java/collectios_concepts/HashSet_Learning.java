package collectios_concepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSet_Learning {

	public static void main(String[] args) {
		// Set interface - not ordered
		// Duplicates are not allowed
		
		
		//Set<String> hs = new HashSet<String>();
		
		SortedSet<String> hs = new TreeSet<String>();
		
		hs.add("Donkey");
		hs.add("Monkey");
		hs.add("Tiger");
		hs.add("Lion");
		//hs.add(null);
		hs.add("Dog");
		
		hs.add("Donkey1");
		hs.add("Monkey2");
		hs.add("Tiger2");
		hs.add("Lion3");
		hs.add("Dog1");
		
		
		System.out.println(hs);
		
		Iterator<String> itr =  hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
