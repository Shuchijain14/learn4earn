package testing_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondCode 
{   
	
	//@BeforeSuite> @BeforeTest> @BeforeClass> @BeforeMethod> @Test> @AfterMethod> @AfterClass> @AfterTest> @AfterSuite
	
	
	public static WebDriver driver;
	 @BeforeSuite
	 public void beforeSuite()
	 {
		 System.out.println("This will be executed First ");
	 }
	 
	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("This will be executed Second");
	 }
	 
	 @BeforeClass
	 public void beforeClass()
	 {
		 System.out.println("This will be executed Third" );
	 }
	 
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("This will be executed Fourth" );
	 }
	 @Test
	 public void init()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rediff.com");
	}
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("This will be executed Sixth" );
	 }
	 @AfterClass
	 public void afterClass()
	 {
		 System.out.println("This will be executed Seventh" );
	 }
	 
	 @AfterTest
	 public void afterTest()
	 {
		 System.out.println("This will be executed Eighth" );
	 }
	 @AfterSuite
	 public void afterSuite()
	 {
		 System.out.println("This will be executed Last" );
	 }
	
	 
	 

}
