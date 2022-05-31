package collectios_concepts;

import java.util.Stack;

public class StackLearning {

	public static void main(String[] args) 
	{
		//  Last - In - First - Out
		//  Basic Operations are:- PUSH and POP
		//  Three more Methods:- Empty, Search and Peek
		
		Stack<String> programs = new Stack<String>();
		programs.push("Java");
		programs.push("Python");
		programs.push(".Net");
		programs.push("JavaScript");

		System.out.println(programs);
		
		//there is a way to make sure the top element goes out and that method is pop
		  System.out.println(programs.peek());
		  //Peek Method tells which element is on top
		  
		  programs.pop();
			System.out.println(programs);

			  System.out.println(programs.peek());

			  programs.pop();
				System.out.println(programs);
				programs.pop();
				programs.pop();

				System.out.println(programs.isEmpty());


	}

}
