package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import pages.LoginPage;
import pages.ProductPage;

public class BuyProductsTest extends BaseTest{
	
	private LoginPage loginPage;
	private ProductPage productPage;
	
	public BuyProductsTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void verifyVisibilityOfAllElements() throws Exception{
		loginPage = new LoginPage();
		productPage = new ProductPage();
		
		this.loginPage.inputUsername().Write("standard_user");
		this.loginPage.inputPassword().Write("secret_sauce");
		this.loginPage.btnLogin().click();
		
		this.productPage.btnProduct(2).click();
		this.productPage.btnProduct(1).click();
		this.productPage.btnProduct(4).click();

		
		Assert.assertEquals(this.productPage.goToMyCart().Text(),"3");
	}
	
	@After
	public void tearDown() {
		this.Finalize();
	}

}
