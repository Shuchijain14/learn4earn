package textxml_understanding;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG 
{
	public static WebDriver driver;
	public static ChromeOptions options;
	
	@Test(threadPoolSize =2, invocationCount = 2)
	@Parameters({"Browser1"," url", "username", "password"})
	public void launchRediffwithChrome(String Browser1, String url, String username, String password)
	{
		System.out.println("Checking TestCase1 :  " + Thread.currentThread().getId());
		if(Browser1.equals("Chrome"))
		{
		
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		
		options.addArguments("start-maximized");		
		driver = new ChromeDriver(options);
		}
		else {
			System.out.println("Browser is not COrrect");
		}
		driver.get("url");   //url is a parameter
		driver.findElement(By.id("login1")).sendKeys(username);;   //username is a parameter
		driver.findElement(By.id("password")).sendKeys(password);;    //password is a parameter
		//driver.findElement(By.xpath(Xpath)).click();     // even the 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.className(logOutLink)).click();
		
	}
	
	
	@Test(threadPoolSize =2, invocationCount = 2)
	@Parameters({"Browser2", "url", "username", "password"})
	public void launchRediffwithFireFox(String Browser2, String url, String username, String password)
	{
		System.out.println("Checking TestCase2 :  " + Thread.currentThread().getId());
		if(Browser2.equals("FireFox"))
		{
		
		WebDriverManager.firefoxdriver().setup();
		driver.manage().window().maximize();
		driver = new FirefoxDriver();
		}else {
			System.out.println("Browser is not COrrect");

		}
		driver.get("url");   //url is a parameter
		driver.findElement(By.id("login1")).sendKeys(username);;   //username is a parameter
		driver.findElement(By.id("password")).sendKeys(password);;    //password is a parameter
		//driver.findElement(By.xpath(Xpath)).click();     // even the 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.className(logOutLink)).click();
		
	}
	@Test
	public void tearDown()
	{
		driver.quit();
	}


}

