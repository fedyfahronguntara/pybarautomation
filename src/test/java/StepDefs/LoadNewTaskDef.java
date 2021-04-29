package StepDefs;

import BaseSetup.Setup;
import Page.LoadNewTaskPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoadNewTaskDef extends Setup {
	
	LoadNewTaskPage page=new LoadNewTaskPage(driver);
	
	@When("Select Equipment")
	public void select_Equipment() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(0);
		page.search("no");
		page.click(2);
		page.click(3);
		page.getassert(0);
	}

	@When("select Task")
	public void select_Task() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(1);
		page.search("Assist Charge Up");
		page.click(2);
		page.click(4);
		page.getassert(1);
		
	}

	@Then("equipment and task has selected")
	public void equipment_and_task_has_selected() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.getassert(0);
		page.getassert(1);
	}
}
