package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.DriverManager;
import junit.framework.Assert;
import pages.LoginPage;
import pages.ProductPage;

public class IvalidLoginTest extends BaseTest {
	private LoginPage loginPage;
	
	public IvalidLoginTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void verifyVisibilityOfAllElements() throws Exception{
		loginPage= new LoginPage();
		
		
 	    //WebElement errorMessage= DriverManager.Instance().Driver().findElement(By.tagName("h3"));
		//Assert.assertTrue(errorMessage.isDisplayed());

		this.loginPage.inputUsername().Write("standard_user");
		this.loginPage.inputPassword().Write("noexiste");
		this.loginPage.btnLogin().click();
		
		WebElement errorMessage= DriverManager.Instance().Driver().findElement(By.tagName("h3"));
		
		Assert.assertTrue(errorMessage.isDisplayed());
		
	}
	
	@After
	public void tearDown() {
		this.Finalize();
	}
}
