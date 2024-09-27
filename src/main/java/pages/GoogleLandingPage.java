package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.WaitUtils;

/*
 * @author AmruthaVarshini
 * 
 */

public class GoogleLandingPage {

	@FindBy(id= "APjFqb")
	private WebElement searchTxt;
	
	public void enterTextInSearchText(String text)
	{
		WaitUtils.waitUntilElementIsVisible(searchTxt).sendKeys(text);
//		searchTxt.sendKeys(text);
		searchTxt.sendKeys(Keys.ENTER);
	}

}
