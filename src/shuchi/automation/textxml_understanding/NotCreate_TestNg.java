package textxml_understanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotCreate_TestNg 
{
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		
		options.addArguments("start-maximized");		
		driver = new ChromeDriver(options);
		driver.get("https://www.rediff.com");

	}

}
