package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import utils.SetUpTearDown;

public class LoginStepDefinition_UsingRegularExpressions extends SetUpTearDown {

//	WebDriver driver;

	SetUpTearDown init = new SetUpTearDown();

//	SoftAssert softAssert = new SoftAssert();

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.walmart.com/account/login");

		init.setUp("https://www.walmart.com/account/login");

		System.out.println("user is in login page");
	}

	@When("^user enters login credentials \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void user_enters_login_credentials(String strArg1, String strArg2) throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys(strArg1);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password")).sendKeys(strArg2);
		Thread.sleep(1000);
		System.out.println("user entered valid credentials");
	}

	@Then("^user is redirected to account page$")
	public void user_is_redirected_to_repository_page() throws InterruptedException {
		String eTitle = "Account";
		String aTitle = driver.getTitle();
		System.out.println(aTitle);

		if (eTitle.equalsIgnoreCase(aTitle)) {
			Assert.assertTrue("user logged in successfully", true);
			Thread.sleep(1500);
		} else {
			Assert.assertTrue("user not logged in successfully", false);

		}

//		softAssert.assertEquals(aTitle, eTitle);
//		driver.quit();
//		softAssert.assertAll();
//		System.out.println("eneded");

//		if (eTitle.equalsIgnoreCase(aTitle))
//		{
//			System.out.println("user landed on account page");
//			driver.quit();
//			System.out.println("ended");
//		}
//			
//		else
//		{
//			System.out.println("user login failed");
//			//Assert.assertEquals(eTitle, aTitle);
//			softAssert.assertEquals(aTitle, eTitle);
//			softAssert.assertAll();
//			System.out.println("ended");
//			driver.quit();
//		}

	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("user clicked on sign in button");
		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Add or edit a payment method']")))); 
	}

	@And("^close the browser$")
	public void close_the_browser() {
		init.tearDown();

	}

}
