package tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import pages.LoginPage;
import pages.ProductPage;

public class ValidLoginTest extends BaseTest {
private LoginPage loginPage;
private ProductPage productPage; 
	
	public ValidLoginTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void verifyVisibilityOfAllElements() throws Exception{
		loginPage= new LoginPage();
		productPage= new ProductPage();
		
		this.loginPage.inputUsername().Write("standard_user");
		this.loginPage.inputPassword().Write("secret_sauce");
		this.loginPage.btnLogin().click();
		
		Assert.assertTrue(this.productPage.lblProduct().Visible());
		Assert.assertEquals(this.productPage.lblProduct().Text(),"Products");
	}
	
	@After
	public void tearDown() {
		this.Finalize();
	}

}