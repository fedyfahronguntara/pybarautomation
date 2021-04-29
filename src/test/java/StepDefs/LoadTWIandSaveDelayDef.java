package StepDefs;

import BaseSetup.BasePOM;
import BaseSetup.Setup;
import Page.LoadTWIandSaveDelayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoadTWIandSaveDelayDef extends Setup{
	
	LoadTWIandSaveDelayPage page= new LoadTWIandSaveDelayPage(driver);
	
	@Given("select Yes for load TWI")
	public void select_Yes_for_load_TWI() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(0);
	}

	@Given("compleate form")
	public void compleate_form() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(1);
		page.click(2);
		page.click(3);
		page.input(0);
		page.input(1);
		page.yesbutton();
	}

	@When("Save Delay")
	public void save_Delay() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(4);
	}

	@Then("back to Mining task Page")
	public void back_to_Mining_task_Page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.miningtask();
	}
}
