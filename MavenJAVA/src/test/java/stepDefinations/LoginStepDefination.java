package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	
	@Before
	public void before() {
		System.out.println("BEFORE");
	}
	
	@After
	public void after() {
		System.out.println("AFTER");
	}
	
	
	@Given("^You are inside the home page$")
	public void you_are_inside_the_home_page() throws Throwable {
	    System.out.println("1");
	}

	@When("^Clicked on Live button on home page$")
	public void clicked_on_Live_button_on_home_page() throws Throwable {
		System.out.println("2");
	}

	@Then("^Validate the overview Tab$")
	public void validate_the_overview_Tab() throws Throwable {
		System.out.println("3");
	}
	
	@Given("You are inside the home page2")
	public void you_are_inside_the_home_page2() {
	    System.out.println("Scene 2");
	}
	@When("Clicked on Live button on home page2")
	public void clicked_on_live_button_on_home_page2() {
		System.out.println("Scene 2");
	}
	@Then("Validate the overview Tab2")
	public void validate_the_overview_tab2() {
		System.out.println("Scene 2");
	}

}
