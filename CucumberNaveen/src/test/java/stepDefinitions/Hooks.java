package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Hooks {
	
	@Before
	@Given("^browser launched and url loaded$")
    public void browser_launched_and_url_loaded() throws Throwable {
        System.out.println("opened browser and site loaded");
    }

	@After
    @Given("^quit the browser$")
    public void quit_the_browser() throws Throwable {
    	System.out.println("closed the browser");
    	System.out.println("======================================");
    }

}
