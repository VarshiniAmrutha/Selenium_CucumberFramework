package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	public static WebDriver driver;
	 public final static long TIMEOUT = 60;

	
	public WaitUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public static WebElement waitUntilElementIsVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
			return wait.pollingEvery(Duration.ofMillis(50L)).until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			return null;
		}
		
	}
	
	public static WebElement waitUntilElementIsPresent(String xpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
			return wait.pollingEvery(Duration.ofMillis(50L)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		} catch (TimeoutException e) {
			return null;
		}
		
	}

	public static WebElement waitUntilElementIsClickable(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
			return wait.pollingEvery(Duration.ofMillis(50L)).until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException e) {
			return null;
		}
		
	}
}
