package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step extends Base {
	
	@Given("User is in Home Page")
	public void user_is_in_Home_Page() {
	    getDriverAccess();
	    sleep();
	    loadUrl("https://www.amazon.in/?tag=operadesktop-21");
	}

	@When("User Enters username and pasword")
	public void user_Enters_username_and_pasword() {
		Page p =new Page();
		fill(p.getFill(),"iphone");
	    
	}

	@Then("User Should navigated to next page")
	public void user_Should_navigated_to_next_page() {
	    
	}




}
