package StepDefs;

import BaseSetup.Setup;
import Page.SummaryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SummaryDef extends Setup{

	SummaryPage page = new SummaryPage(driver);
	@Given("select Location")
	public void select_Location() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(0);
	}

	@When("Clcik summary button")
	public void clcik_summary_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		page.click(1);
	}

	@Then("summary page is display")
	public void summary_page_is_display() {
	    // Write code here that turns the phrase above into concrete actions
		page.getassert();

}
	
}
