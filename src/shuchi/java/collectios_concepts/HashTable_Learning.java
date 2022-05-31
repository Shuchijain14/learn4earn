package collectios_concepts;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable_Learning {

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht  = new Hashtable<Integer, String>();
		ht.put(1, "Rucha");
		ht.put(2, "Harsheet");
		ht.put(3, "Shuchi");
		
		System.out.println(ht.get(1));
		
		for(Entry<Integer, String> s: ht.entrySet())
		
			System.out.println(s.getKey() + " " + s.getValue());
		

	}

}
