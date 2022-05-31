package thisandsuper;

public class Childsuper extends Parentsuper    
{
	
	
	int i =20;
	
	public void check(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);   // this will refer to instance variable of parent class which is i=10
		
		
	}
	
	
	
	
	
	
	
	
	


	public static void main(String[] args)
	{
		Childsuper obj = new Childsuper();
		obj.check(30);
		

	}

}
