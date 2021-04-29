package StepDefs;

import BaseSetup.Setup;
import Page.FinalisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FinaliseDef extends Setup{

	
	FinalisePage page = new FinalisePage(driver);
	@Given("navigate to summary")
	public void navigate_to_summary() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(0);
	}

	@When("click finalise Plod button")
	public void click_finalise_Plod_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		page.click(1);
//		page.getassert(0);
	}

	@When("click Finish")
	public void click_Finish() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		page.click(2);
		page.getassert(1);
	}

	@When("click button logout")
	public void click_button_logout() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(3);
	}

	@Then("back to login page")
	public void back_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.ucumber.java.PendingException();
		page.getassert(2);
	}
}
