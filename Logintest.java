package Pageobject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Logintest extends BaseTestcase  {

	
	Loginpage loginpage;
	Homepage homepage;
	String mailID="gopalgoyal488@gmail.com";

	
	@Test(priority = 0)
	
public void loading(){
	
	loginpage =new Loginpage(driver);
  loginpage.loginadmin("Admin", "admin123");
		Assert.assertEquals(loginpage.getpagetitle(), "OrangeHRM");
		
	}
	
	@Test(priority = 1 )
	
	public void home(){
		

	homepage= loginpage.loginadmin("Admin", "admin123");	
	homepage.usertest("gopal");
	homepage.recordFound();
	//Assert.assertEquals(loginpage.getpagetitle(), "OrangeHRM");
		
	}
	
	
	//@Test()
	
	public void forgotpaww() {
		
		loginpage =new Loginpage(driver);
		
		loginpage.forgtpass(mailID);
		
		//this is qa test
		
		//add comment after stagin
	
	
	}//

	
	
		
	}

