package collectios_concepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 
{

	public static void main(String[] args) 
	{
		
		/* String[] students = new String[20];
		students[19] = "Gundeep";
		System.out.println(students[19]);
		students[20] = "Rucha";
		System.out.println(students[20]);   */


		List list = new ArrayList();
		list.add("BMW");
		list.add("Mercedes");
		list.add("Audi");
		list.add("Jaguar");
		
		System.out.println(list.size());

	}

}
