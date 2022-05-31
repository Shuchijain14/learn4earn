package testngxml_understanding;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


	public class SignInLink extends Base
	{
		@Test 
		public static void main(String[] args)
		{
			driver.findElement(By.className("signin")).click();
		}
	}


