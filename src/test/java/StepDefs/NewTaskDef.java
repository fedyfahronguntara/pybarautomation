package StepDefs;

import BaseSetup.Setup;
import Page.NewTaskPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTaskDef extends Setup{
	
	NewTaskPage page=new NewTaskPage(driver);
	@When("click New Task Button")
	public void click_New_Task_Button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(0);
	}

	@When("click New Mining Task button")
	public void click_New_Mining_Task_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(1);
	}

	@Then("mining task form is clear")
	public void mining_task_form_is_clear() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.getassert();
	}

}
