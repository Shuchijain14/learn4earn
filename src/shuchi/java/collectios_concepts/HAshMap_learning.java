package collectios_concepts;

import java.util.HashMap;
import java.util.Map;

public class HAshMap_learning {

	public static void main(String[] args) 
	{
		HashMap<String, String> hm  = new HashMap<String, String>();
		hm.put("student1", "Rucha");
		hm.put("student2", "Harsheet");
		hm.put("student3", "Shuchi");
		
		System.out.println(hm.get("student1"));
		
		for(Map.Entry<String, String> s: hm.entrySet())
		
			System.out.println(s.getKey() + " " + s.getValue());
		
		
	}

}
