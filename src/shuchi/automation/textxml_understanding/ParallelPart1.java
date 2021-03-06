package textxml_understanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelPart1 
{
	public static WebDriver driver;
	
	
	@Test(threadPoolSize = 3,invocationCount = 3)
	public void testcase1()
	{
		System.out.println("Checking TestCase1:  " + Thread.currentThread().getId());
		//System.out.println("Checking TestCase1: " + Thread.currentThread().getName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
	
	}
	
	@Test(threadPoolSize = 3,invocationCount = 3)
	public void testcase2()
	{
		System.out.println("Checking TestCase2: " + Thread.currentThread().getId());
		//System.out.println("Checking TestCase2: " + Thread.currentThread().getName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	
	
	}
	
	@Test(threadPoolSize = 3,invocationCount = 3)
	public void testcase3()
	{
		System.out.println("Checking TestCase3: " + Thread.currentThread().getId());
		//System.out.println("Checking TestCase3: " + Thread.currentThread().getName());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
	
	
	}
	

}
