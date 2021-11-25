package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Tags {

	@Given("^user logs into portal$")
    public void user_logs_into_portal() throws Throwable {
		System.out.println("@Smoke @Regression @EndtoEnd");
        
    }

    @Given("^user searches for product$")
    public void user_searches_for_product() throws Throwable {
    	System.out.println("@Smoke");
        
    }
    

    @Before("@First, @Second, @Third")
    @Given("^user adds a product to bag$")
    public void user_adds_a_product_to_bag() throws Throwable {
    	System.out.println("@Smoke @Regression @EndtoEnd // product added to basket");
        
    }

    @Given("^user in order history page$")
    public void user_in_order_history_page() throws Throwable {
    	System.out.println("@Regression");
        
    }

    @Given("^user signs up$")
    public void user_signs_up() throws Throwable {
    	System.out.println("@Regression @EndtoEnd");
        
    }

    @Given("^user orders a aproduct$")
    public void user_orders_a_aproduct() throws Throwable {
    	System.out.println("@EndtoEnd");
        
    }

    @Given("^subscribes for a product$")
    public void subscribes_for_a_product() throws Throwable {
    	System.out.println("@Regression");
        
    }

    @Given("^user changes password$")
    public void user_changes_password() throws Throwable {
    	System.out.println("@EndtoEnd");
        
    }

    @Given("^user checks order status$")
    public void user_checks_order_status() throws Throwable {
    	System.out.println("@Smoke @EndtoEnd");
        
    }

    @Given("^user adds product to fav$")
    public void user_adds_product_to_fav() throws Throwable {
    	System.out.println("@Regression @EndtoEnd");
        
    }

}
