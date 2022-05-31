package window_handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Windows {
	public static WebDriver driver;
	
	

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("the parent window is : " + parentWindowHandle);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id ='newWindowBtn']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle:handles)
		{
			System.out.println(handle);
			
				if(!handle.equals(parentWindowHandle))
				{
					driver.switchTo().window(handle);
					driver.manage().window().maximize();
					driver.findElement(By.id("firstName")).sendKeys("Shuchi");
					driver.findElement(By.id("lastName")).sendKeys("Jain");
					driver.close();
					
				}
		}
		driver.switchTo().window(parentWindowHandle);
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.PAGE_UP).build().perform();
		
		boolean check = driver.findElement(By.id("name")).isEnabled();
		
		if(check == true)
		{
			driver.findElement(By.id("name")).sendKeys("seleniumpanda@rediff.com");
		}else {
			System.out.println("The COntrol has not come back to parent window ");
		}
		
	}

}
