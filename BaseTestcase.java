package Pageobject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTestcase extends LoadableComponent<BaseTestcase> {
// base test case
	protected  WebDriver driver;
	@BeforeMethod
    public  void setUp() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

   @AfterMethod
    public void tearDown() {
       // driver.close();
      
    }

@Override
protected void isLoaded() throws Error {
	// TODO Auto-generated method stub
	
}

@Override
protected void load() {
	// TODO Auto-generated method stub
	
}



		
	}

