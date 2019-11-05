package tests;
import junit.framework.Assert;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverManager;
import junit.framework.Assert;
import pages.ProductPage;

public class LoginAllElementsTest extends BaseTest {
	private LoginPage loginPage;
	private ProductPage productPage;
	
	public LoginAllElementsTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void verifyVisibilityOfAllElements() throws Exception{
		loginPage = new LoginPage();
		
		Assert.assertTrue(this.loginPage.inputUsername().Visible());
		Assert.assertEquals(this.loginPage.inputUsername().getAtribute("placeholder"),"Username");
		
		Assert.assertTrue(this.loginPage.inputPassword().Visible());
		Assert.assertEquals(this.loginPage.inputPassword().getAtribute("placeholder"), "Password");
		
		Assert.assertTrue(this.loginPage.btnLogin().Visible());

	}
	
	@After
	public void tearDown() {
		this.Finalize();
	}
}

