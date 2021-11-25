package stepDefinitions;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.SetUpTearDown;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchStepDefinition extends SetUpTearDown {

	SetUpTearDown init = new SetUpTearDown();

	WebElement searchbox;

	@Given("^user cliscks on search field$")
	public void user_cliscks_on_search_field() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.walmart.com/");

		init.setUp("https://www.walmart.com/");

		Thread.sleep(1000);
		System.out.println("user is on home page");
		searchbox = driver.findElement(By.cssSelector("#global-search-input"));
		searchbox.click();
		Thread.sleep(1000);
	}

	@Then("^user is redirected to PLP and close the browser$")
	public void user_is_redirected_to_plp_and_close_the_browser() throws Throwable {
		String eTitle = "watches - Walmart.com";
		String aTitle = driver.getTitle();

		if (eTitle.equalsIgnoreCase(aTitle))
			System.out.println("user navigated to the watches plp");
		else
			System.out.println("user in different page");

		init.tearDown();
	}

	@And("^user enters keyword$")
	public void user_enters_keyword() throws InterruptedException {
		searchbox.sendKeys("watches");
		Thread.sleep(1000);
	}

	@And("^clicks on search icon$")
	public void clicks_on_search_icon() throws InterruptedException {
		driver.findElement(By.cssSelector("#global-search-submit")).click();
		Thread.sleep(2500);

	}

}
