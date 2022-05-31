package collectios_concepts;

import java.util.ArrayList;

public class ArrayVsCollectionFramework {

	public static void main(String[] args) 
	{
		int i[] = {1,2,3,4};
		
		ArrayVsCollectionFramework ref = new ArrayVsCollectionFramework();
		ArrayVsCollectionFramework ref1 = new ArrayVsCollectionFramework();
		ArrayVsCollectionFramework ref2 = new ArrayVsCollectionFramework();
		ArrayVsCollectionFramework ref3 = new ArrayVsCollectionFramework();
		ArrayVsCollectionFramework ref4 = new ArrayVsCollectionFramework();
		ArrayVsCollectionFramework ref5 = new ArrayVsCollectionFramework();

		
		ArrayVsCollectionFramework refn[] = {ref, ref1, ref2, ref3, ref4, ref5};
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("Shuchi");
		a1.add('$');
		
		System.out.println(a1);

		
		
		
	}

}
