package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.SetUpTearDown;

public class ContactUs_UsingMaps extends SetUpTearDown {

	SetUpTearDown init1 = new SetUpTearDown();

//	@Given("^clicks on registery link map$")
//	public void user_is_in_contact_us_page_map() {
//		init1.setUp("https://help.walmart.com/app/ask#");
//	}

	@When("^clicks on registery link map$")
	public void clicks_on_registery_link() {
		driver.findElement(By.cssSelector("#rn_AskCategorySelect_4_cat_select_registry")).click();
	}

	@Then("^form is open and user enters the below data map$")
	public void form_is_open_and_user_enters_the_below_data_map(DataTable dt) throws InterruptedException {

//		for (List <Map<String, String>> data = (List<Map<String, String>>) dt.asMaps(String.class, String.class))
//
//		 {
//			driver.findElement(By.xpath("(//input[@name='Contact.Name.First'])[1]")).sendKeys(data.get("First Name"));
//			Thread.sleep(1500);
//			
//			driver.findElement(By.xpath("(//input[@name='Contact.Name.Last'])[1]")).sendKeys(data.get("Last Name"));
//			Thread.sleep(1500);
//			
//			driver.findElement(By.xpath("(//input[@name='Contact.Emails.PRIMARY.Address'])[1]"))
//					.sendKeys(data.get("e-mail"));
//			Thread.sleep(1500);
//			
//			driver.findElement(By.xpath("(//input[@name='Incident.CustomFields.c.call_back_number'])[1]"))
//					.sendKeys(data.get("Phone Number"));
//			Thread.sleep(1500);
//			
//			driver.findElement(By.xpath("//textarea[@id='rn_TextInput_18_Incident.Threads']"))
//					.sendKeys(data.get("Message"));
//			Thread.sleep(1500);
//		}

	}

	@And("^clicks on email link map$")
	public void clicks_on_email_link_map() {
		driver.findElement(By.cssSelector("#rn_AskChannelForms_5_select_email")).click();
	}

	@And("^clicks on submit button map$")
	public void clicks_on_submit_button_map() throws InterruptedException {
		driver.findElement(By.cssSelector("#rn_AskFormSubmit_19_Button")).click();
		Thread.sleep(1500);
		Boolean h2 = driver.findElement(By.xpath("(//h2)[1]")).isDisplayed();

		if (h2)
			// System.out.println("true");

			Assert.assertTrue("form not submitted", h2);
	}

//	@And("^close the browser map$")
//  public void close_the_browser_map() {
//		init.tearDown();
//	}

}
