package StepDefs;

import BaseSetup.Setup;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef extends Setup{
	
	LoginPage page = new LoginPage(driver);
	
	@Given("open app")
	public void open_app() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.clickapp();
	}

	@Given("fill username <username> and password <password>")
	public void fill_username_username_and_password_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.select_username();
		page.inputpassword("101");
	}

	@When("click contoinue button")
	public void click_contoinue_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.continuebtn();
	}

	@Then("new task page is display")
	public void new_task_page_is_display() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
	}
}
