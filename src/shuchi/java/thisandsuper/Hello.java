package thisandsuper;

public class Hello
{
	int i;     //default value is 0
	String S1;  //default value is null
	
	//public void learn(int j, String S2)      //(output is 10 Selenium
	public void learn(int i, String S1)       //(output is 0 null
	{
		//i=j;
		//S1=S2;
		
		//i=i;
		//S1=S1;     //(output is 0 null
		
		// now this keyword come in the picture
		
		this.i = i;
		this.S1 = S1;     //output is 10 Selenium
		
		
	}
	public void learnMore()
	{
		System.out.println(i);
		System.out.println(S1);
		
		
	}
	
	

}
