package concepts_string;

public class Immutable
{
	public static void main(String[] args)
	{
		String S = new String("Selenium");
		S.concat("Java");
		System.out.println(S);
		S = S.concat("  C++");
		System.out.println(S);
		
		String player1 = "Soccer";       
		System.out.println(player1);
		
		String player2 = "Cricket";		// String literal is Cricket (1 object will be created in SCP)
		System.out.println(player2);
		
		String player3 = "Cricket";				// No Object will be created rather player 2 will refer to Cricket
		System.out.println(player3);
		
		
		
		
	}

}
