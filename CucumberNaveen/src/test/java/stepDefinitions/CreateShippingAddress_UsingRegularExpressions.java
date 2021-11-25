package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import com.sun.org.apache.xml.internal.security.Init;

import utils.SetUpTearDown;

public class CreateShippingAddress_UsingRegularExpressions extends SetUpTearDown {

	SetUpTearDown init = new SetUpTearDown();

	@When("^user clicks on add shiiping address link$")
	public void user_clicks_on_add_shiiping_address_link() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Add or edit a shipping address']")).click();
		Thread.sleep(1000);
	}

	@Then("^user enters the shipping address \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_shipping_address(String fn, String ln, String pn, String address, String city,
			String zip) throws InterruptedException {

		init.deleteShippignAddress();

		System.out.println("entering first name");
		driver.findElement(By.cssSelector("#firstName")).sendKeys(fn);
		System.out.println("entering last name");
		driver.findElement(By.cssSelector("#lastName")).sendKeys(ln);
		System.out.println("entering phone number");
		driver.findElement(By.cssSelector("#phone")).sendKeys(pn);
		System.out.println("entering address");
		driver.findElement(By.cssSelector("#addressLineOne")).sendKeys(address);
		System.out.println("city");
		driver.findElement(By.cssSelector("#city")).sendKeys(city);
		System.out.println("zip");
		driver.findElement(By.cssSelector("#postalCode")).sendKeys(zip);
		System.out.println("slecting state");
		Select select = new Select(driver.findElement(By.cssSelector("#state")));
		select.selectByValue("KS");
	}

	@Then("^user clicks on save button in shipping page$")
	public void user_clicks_on_save_button_in_shipping_page() throws InterruptedException {
		System.out.println("clicked on save button");
		driver.findElement(By.cssSelector(".spin-button-children")).click();
		Thread.sleep(1000);
	}

	@Then("^user clicks on saveaddress button in confirmation page and navigated to shipping address page$")
	public void user_clicks_on_saveaddress_button_in_confirmation_page_and_navigated_to_shipping_address_page()
			throws InterruptedException {
		driver.findElement(By.xpath("(//button[@data-automation-id='button'])[2]")).click();
		Thread.sleep(1000);

		if (driver.findElement(By.cssSelector(".address-book-details")).isDisplayed()) {
			// System.out.println("address created successfully");
			init.tearDown();
			Assert.assertTrue("address created successfully", true);
		} else {
			init.tearDown();
			Assert.assertTrue("address not created", false);
		}

	}

}
