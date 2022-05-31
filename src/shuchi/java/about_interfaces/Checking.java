package about_interfaces;

public interface Checking
{
	void demand();
	public abstract void supply();
	
	int i=10;
	public static final int j = 11;
	
	default void start()
	{
		
	}
	public static void main(String[] args)
	{
		System.out.println(1+2);
	}
	public static void hello()
	{
		
	}
	/*private static void dumshum()
	{
		
	}*/
	
}
