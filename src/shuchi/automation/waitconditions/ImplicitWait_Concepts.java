package waitconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_Concepts {
	
	public static WebDriver driver;

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);  //slowest mode
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);   //fastest mode
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);   // normal speed
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.rediff.com");
		
		WebElement footer = driver.findElement(By.xpath("//div[@class = 'footer alignC']"));
		System.out.println(footer.isDisplayed());
		
		


	}

}
