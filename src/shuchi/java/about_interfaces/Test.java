package about_interfaces;

public class Test implements Checking
{

	public static void main(String[] args)
	{
		Checking check = new Test();
		check.demand();
		check.supply();
		
		Test test = new Test();
		test.demand();
		test.supply();
		
	}
	@Override
	public void demand()
	{
		System.out.println("This is demand with body of implementation ");
	}
	
	@Override
	public void supply()
	{
		System.out.println("This is supply with body of implementation");
	}

}
