package steps;

import Utilities.BasePage;
import io.cucumber.java.After;

public class Hooks {
	
	BasePage basePage;
	
	public Hooks(BasePage basePage) {
		this.basePage = basePage;
	}
	
	/*
	 * 
	 */
	@After
	public void tearDownUiTest() {
		
		basePage.testEnvironment.driver.close();
	}

}
