package Utilities;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class UiUtils {
	
	public static WebDriver driver;
	
	
	public UiUtils(WebDriver driver) {
		this.driver = driver;
		
	}
	public void refreshPage() {
        driver.navigate().refresh();
    }
	
	public static WebElement getWebElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	/*
	 * Switching to new window or Tab
	 */
	public void switchtoNewWindow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(numberOfWindowsToBe(2));
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
	}
	
	public void switchBackToOriginalTab() {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        if (windows.size() > 1) {
            driver.close();
        }
        driver.switchTo().window(windows.get(0));
    }
	
	public static void moveToElement(String xpath) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(xpath)).build().perform();
    }
	
	public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
	
	public static void enterText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }
	
	public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
	
	public void dragAndDrop(String sourceLocator, String destinationLocator) {
        WebElement from = getWebElement(sourceLocator);
        WebElement to = getWebElement(destinationLocator);

        Actions builder = new Actions(driver);
        Action dragAnddrop = builder.clickAndHold(from)
            .moveToElement(to)
            .release(to)
            .build();
        dragAnddrop.perform();
    }
	
	public void switchToFrame(String xpath) {
		
	}

}
