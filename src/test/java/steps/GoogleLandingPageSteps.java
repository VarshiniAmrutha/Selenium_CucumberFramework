package steps;


import Utilities.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleLandingPage;
/*
 * Step definitions
 */

public class GoogleLandingPageSteps {
	public BasePage basePage;
	public GoogleLandingPage googleLandingPage;
	
	public GoogleLandingPageSteps(BasePage basePage) {
		this.basePage = basePage;
		googleLandingPage = basePage.pageObjectManager.getGoogleLandingPage();
	}
	
	//Basic test to check execution of framework
	
	@When("^I search for (.*)$")
	public void iSearchForText(String searchText) {
		googleLandingPage.enterTextInSearchText(searchText);
	}
	
	@Then("^I verify results contain (.*)$")
	public void verifySearchResults(String text) {
		//Implement validation
	}



}
