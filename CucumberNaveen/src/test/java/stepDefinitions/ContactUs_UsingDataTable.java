package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.SetUpTearDown;

public class ContactUs_UsingDataTable extends SetUpTearDown {

	SetUpTearDown init = new SetUpTearDown();

	@Given("^user is in contact us page$")
	public void user_is_in_contact_us_page() {

		init.setUp("https://help.walmart.com/app/ask#");
	}

	@When("^clicks on registery link$")
	public void clicks_on_registery_link() throws InterruptedException {

		driver.findElement(By.cssSelector("#rn_AskCategorySelect_4_cat_select_registry")).click();
		Thread.sleep(500);
	}

	@Then("^form is open and user enters the below data$")
	public void form_is_open_and_user_enters_the_below_data(DataTable data) {
		List<List<String>> userInfo = data.asLists();

		driver.findElement(By.xpath("(//input[@name='Contact.Name.First'])[1]")).sendKeys(userInfo.get(0).get(0));

		driver.findElement(By.xpath("(//input[@name='Contact.Name.Last'])[1]")).sendKeys(userInfo.get(0).get(1));

		driver.findElement(By.xpath("(//input[@name='Contact.Emails.PRIMARY.Address'])[1]"))
				.sendKeys(userInfo.get(0).get(2));

		driver.findElement(By.xpath("(//input[@name='Incident.CustomFields.c.call_back_number'])[1]"))
				.sendKeys(userInfo.get(0).get(3));

		driver.findElement(By.xpath("//textarea[@id='rn_TextInput_18_Incident.Threads']"))
				.sendKeys(userInfo.get(0).get(4));
	}

	@And("^clicks on email link$")
	public void clicks_on_email_link() throws InterruptedException {

		driver.findElement(By.cssSelector("#rn_AskChannelForms_5_select_email")).click();
		Thread.sleep(500);
	}

	@And("^clicks on submit button$")
	public void clicks_on_submit_button() throws InterruptedException {

		driver.findElement(By.cssSelector("#rn_AskFormSubmit_19_Button")).click();
		Thread.sleep(2000);
		Boolean h2 = driver.findElement(By.xpath("(//h2)[1]")).isDisplayed();

		if (h2)
			System.out.println("true");

		Assert.assertTrue("form not submitted", h2);

	}

//	@And("^close the browser$")
//	public void close_the_browser() {
//		init.tearDown();
//	}

}
