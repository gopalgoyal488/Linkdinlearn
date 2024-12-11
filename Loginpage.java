package Pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends BaseClass   {
	//private BaseClass base;
	//private WebDriver driver;
	
	By Username= By.xpath("//input[@placeholder='Username']");
	By Password= By.xpath("//input[@placeholder='Password']");
	By login= By.xpath("//button[text()=' Login ']");
	By forgotpassword= By.xpath("//p[text()='Forgot your password? ']");
	By resetid=By.xpath("//input[@placeholder='Username']");
	By userdrop=By.xpath("//div/ul/li/span[@Class='oxd-userdropdown-tab']");
	By logout = By.xpath("//a[text()='Logout']");
	By resetPassword= By.xpath("//button[text()=' Reset Password ']");

	
public  Loginpage(WebDriver driver) {
 super(driver);
	// base = new BaseClass();
}
	

	
	public Homepage loginadmin(String User, String Pass ) {
		
		 
	 waitForElementVisible(Username);
	 driver.findElement(Username).sendKeys(User);
	 waitForElementVisible(Password);
	 driver.findElement(Password).sendKeys(Pass);
	  waitForElementClickable(login);
      driver.findElement(login).click();
       Homepage homepage = new Homepage(driver);
      return homepage;
		
	}

	public void forgtpass(String resid) {
		waitForElementClickable(forgotpassword);
		driver.findElement(forgotpassword).click();
	    waitForElementVisible(resetid);
		driver.findElement(Username).sendKeys(resid);
	     waitForElementClickable(resetPassword);
	     driver.findElement(resetPassword).click();
		
	}
	public void clossbrawsertab() {
		//driver.close();
		driver.quit();
		
	}

	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		
		waitForElementClickable(userdrop);
		driver.findElement(userdrop).click();
		waitForElementClickable(logout);
		driver.findElement(logout).click();	
	}

	public String getpagetitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}



	




}
