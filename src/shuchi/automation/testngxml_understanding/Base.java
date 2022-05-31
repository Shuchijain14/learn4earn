package testngxml_understanding;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base
{
	public static WebDriver driver;
	
	@Test
	public void initialize()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		//options.addArgument("headless");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.rediff.com");
		
		
	}

}
