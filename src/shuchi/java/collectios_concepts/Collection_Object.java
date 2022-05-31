package collectios_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collection_Object
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add("Shuchi");
		a1.add('$');
		
		HashSet hs = new HashSet();
		hs.add(101);
		hs.add("Rahul");
		hs.add('%');
		
		HashMap hp = new HashMap();
		hp.put(101, "Shuchi");
		hp.put(102, "Arnim");
		hp.put(103, "Rahul");
		
		System.out.println(a1);
		System.out.println(hs);
		System.out.println(hp);
	}

}
