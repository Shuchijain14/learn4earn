package collectios_concepts;

import java.util.ArrayList;

public class Wrapper_Concepts {

	public static void main(String[] args) 
	{
		Integer myInt =1000;
		String myString = myInt.toString();
		System.out.println(myString.length());

		
		Integer myInt1 = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		
		System.out.println(myInt1.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
		
		
		Integer myInt4 = 5;
		Double myDouble1 = 2.33;
		Character myChar1 = 'W';
		
		System.out.println(myInt4);
		System.out.println(myDouble1);
		System.out.println(myChar1);
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(20);
		myNumbers.add(30);
		myNumbers.add(40);
		
		for(int i:myNumbers)
		{
			System.out.println(i);
		}
		
		myNumbers.remove(2);
		System.out.print(myNumbers);
		
		}

}
