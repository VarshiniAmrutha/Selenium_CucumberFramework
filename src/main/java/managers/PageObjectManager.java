package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.GoogleLandingPage;

/*
 * @author AmruthaVarshini
 * 
 * PageObjectManager handles the object creation of the pages and initializing them using 
 * the page factory design pattern
 * 
 */

public class PageObjectManager {
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public void pageFactoryInit(Object obj) {
		PageFactory.initElements(driver, obj);
	}

	public GoogleLandingPage getGoogleLandingPage() {
		GoogleLandingPage googleLandingPage = new GoogleLandingPage();
		pageFactoryInit(googleLandingPage);
		return googleLandingPage;
	}
}
