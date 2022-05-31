package textxml_understanding;

import org.testng.annotations.Test;

public class Groups_Concepts 
{
	@Test(groups = {"smoke"})
	public void tc1()
	{
		System.out.println("Test Case1 Logic");
	}
	@Test(groups = {"sanity", "smoke"})
	public void tc2()
	{
		System.out.println("Test Case 2Logic");
	}
	@Test(groups = { "sanity", "smoke", "regression"})
	public void tc3()
	{
		System.out.println("Test Case3 Logic");
	}
	@Test(groups = { "sanity", "smoke", "regression",""})
	public void tc4()
	{
		System.out.println("Test Case4 Logic");
	}
	@Test(groups = { "sanity", "smoke", "regression","unit", "uta"})
	public void tc5()
	{
		System.out.println("Test Case5 Logic");
	}

}
