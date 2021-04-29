package StepDefs;

import BaseSetup.Setup;
import Page.PrestartandreturntoTaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class prestartandReturntoTaskDef extends Setup{
	
	PrestartandreturntoTaskPage page=new PrestartandreturntoTaskPage(driver);

	@When("click prestart History")
	public void click_prestart_History() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(0);
	}

	@Then("prestart history is display")
	public void prestart_history_is_display() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.getassert();
	}

	@Given("in summary page")
	public void in_summary_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(1);
	}

	@When("click return to task button")
	public void click_return_to_task_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(2);
	}
}
