package thisandsuper;

public class HomePage extends Login       //inheritance
{
	String username = "Python"; //2 instance variables of the child class 
	String password = "Loving!123";
	
	public void showMe(String username, String password)
	{
			System.out.println(username+"--------"+password);
			System.out.println(this.username+"--------"+this.password);
			System.out.println(super.username+"-------"+super.password);
	}
	
	
	public static void main(String[] args)
	{
		HomePage hp = new HomePage();
		hp.showMe("automationhub", "Java@123");
		

	}

}
