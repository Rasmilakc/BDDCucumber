package StepOfDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard {
	@Given("the user is on the dlogin page")
	public void the_user_is_on_the_dlogin_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("goodmorning");
	}

	@When("the user enters valid dusername and password")
	public void the_user_enters_valid_dusername_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("goodmorning");
	}

	@When("clicks on the dLogin button")
	public void clicks_on_the_d_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("goodmorning");
	}

	@Then("the user should be navigated to the dashboard")
	public void the_user_should_be_navigated_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("goodmorning");
	}



}
