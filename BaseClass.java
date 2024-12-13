package Pageobject;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;

	public class BaseClass {
	    
		protected WebDriver driver;
		
		//baseclass QA test please check

	    // Initialize WebDriver
	    public BaseClass(WebDriver driver) {
	
	       this.driver= driver;
	        
	    }


	    // Explicit Wait
	    WebElement waitForElementVisible(By locator) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    public void waitForElementClickable(By locator) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }

	    // Select Class (Dropdown Handling)
	    public void selectByVisibleText(By locator, String visibleText) {
	        Select select = new Select(driver.findElement(locator));
	        select.selectByVisibleText(visibleText);
	    }

	    public void selectByValue(By locator, String value) {
	        Select select = new Select(driver.findElement(locator));
	        select.selectByValue(value);
	    }

	    public void selectByIndex(By locator, int index) {
	        Select select = new Select(driver.findElement(locator));
	        select.selectByIndex(index);
	    }

	    // Actions Class (Mouse and Keyboard Actions)
	    public void hoverOverElement(By locator) {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(driver.findElement(locator)).perform();
	    }

	    public void doubleClickElement(By locator) {
	        Actions actions = new Actions(driver);
	        actions.doubleClick(driver.findElement(locator)).perform();
	    }

	    public void rightClickElement(By locator) {
	        Actions actions = new Actions(driver);
	        actions.contextClick(driver.findElement(locator)).perform();
	    }

	    public void dragAndDrop(By sourceLocator, By targetLocator) {
	        Actions actions = new Actions(driver);
	        WebElement source = driver.findElement(sourceLocator);
	        WebElement target = driver.findElement(targetLocator);
	        actions.dragAndDrop(source, target).perform();
	    }

	    // Take Screenshot
	    public String takeScreenshot(String testName) {
	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	        String screenshotPath = "screenshots/" + testName + "_" + timestamp + ".png";
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File destFile = new File(screenshotPath);
	        try {
	            Files.copy(srcFile.toPath(), destFile.toPath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return screenshotPath; // Return path for reporting
	    }

	    // Reporting Utility (Logging or Attach Screenshots in Reports)
	    public void logInfo(String message) {
	        // Simple example for logging
	        System.out.println("[INFO] " + message);
	    }

	    public void logError(String message) {
	        // Simple example for logging errors
	        System.err.println("[ERROR] " + message);
	    }
	}
	

