package string_operations;

public class Introduction {

	public static void main(String[] args) {
		//1. String is a non primitive data types
		//2. String size if not fixed
		//3. String is also a sequence of Characters
		//4. String is also called Array of Characters
		
		char arr[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		String S1 = new String(arr);
		System.out.println(S1);

		char arr1[] = {'!', '@', '#', '$', '%','^', '&', '*', '(', ')'};
		
		String S2 = new String(arr1);
		System.out.println(S2);
		
		//5. String also acts as a Class. String has a lot of methods too 
		
		
		//String S3 = new String();
		
		//6. String is also an immutable Object
		
		String S4 = "Mandy";
		S4 = "Sandy";
		System.out.println(S4);
		
		//7. Multiple ways to Create String Objects
		
		String S5 = new String("Hello World");
		String S6 = "Monkey";
		
		StringBuffer S7 = new StringBuffer();
		StringBuffer S8 = new StringBuffer();
		
		System.out.println(S6);
		
		
	}

}
