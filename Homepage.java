package Pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BaseClass {
	
	//private WebDriver driver;
	
	private BaseClass base;
	private By Username= By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By Admin = By.linkText("Admin");
	private By welcomeMessage = By.id("welcome");
   private By checkbox =By.xpath("(//input[@type='checkbox'])[3]");
 
    public Homepage(WebDriver driver) {
    super(driver);
    
   // base = new BaseClass(driver);
}



	public String getWelcomeMessage(){
        return driver.findElement(welcomeMessage).getText();
    } 
       
    
    public void usertest(String str) {
    	waitForElementVisible(Admin);
    	driver.findElement(Admin).click();
        	
        waitForElementVisible(Username);
     //   driver.findElement(Username).click();
        driver.findElement(Username).sendKeys(str);
        //this is qa test 
        
        }
        
    public void recordFound() {
    	
    	waitForElementClickable(checkbox);
    	driver.findElement(checkbox).click();
    }



	
}
