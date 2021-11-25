package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpTearDown {
	public static WebDriver driver;
	
	public void setUp(String URL)
	{
		System.out.println("in setup method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	
	public void tearDown()
	{
		System.out.println("in tear down method");
		driver.quit();
	}
	
	public void deleteShippignAddress() throws InterruptedException {
		List <WebElement> deleteAddressLinks = driver.findElements(By.xpath("//button[@data-automation-id= 'delete-address-1']"));
		
		System.out.println("delete Links in size: " + deleteAddressLinks.size());
		
		for (int i=0; i < deleteAddressLinks.size(); i++)
		{
			deleteAddressLinks.get(i).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@data-automation-id='confirm-delete-1']")).click();
			System.out.println("Delete link " + i + "deleted");
		}
	}

}
