package Utilities;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;

public class BasePage {
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestEnvironment testEnvironment;
	public UiUtils uiUtils;
	
	/*
	 * @author AmruthaVarshini
	 */
	
	public BasePage()
	{
		testEnvironment = new TestEnvironment();
		pageObjectManager = new PageObjectManager(testEnvironment.WebDriverManager());
		testEnvironment.navigateToUrl();
		uiUtils = new UiUtils(driver);
	}

}
