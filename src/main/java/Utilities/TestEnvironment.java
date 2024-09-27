package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class TestEnvironment {
	public WebDriver driver;
	
	/*
	 * System property has to be set for the drivers.
	 */
	public WebDriver WebDriverManager()
	{
		if(driver == null) {
		switch (getProperties(Constants.GLOBAL_PROPERTY_PATH).getProperty("browser")) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "iexplore":
		case "internet explorer":
		case "ie":
			driver = new InternetExplorerDriver();		
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		case "edge":
		case "microsoftedge":
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
		}
		return driver;
		
	}
	
	public void navigateToUrl() {
		driver.get(getProperties(Constants.GLOBAL_PROPERTY_PATH).getProperty("url"));
	}
	
	

	public static Properties getProperties(String propertyPath) {
		Properties properties = new Properties();
		try {
		FileInputStream fis = new FileInputStream(propertyPath);
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}
