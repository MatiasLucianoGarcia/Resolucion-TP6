package tests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.ProductPage;

public class MyCartTest extends BaseTest {

	private LoginPage loginPage;
	private ProductPage productPage;
	
	public MyCartTest() {
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
		
		this.productPage.goToMyCart().click();
		
		Assert.assertTrue(this.productPage.myProduct(1).Visible());
		Assert.assertTrue(this.productPage.myProduct(2).Visible());
		Assert.assertTrue(this.productPage.myProduct(2).Visible());
		
	}
	
	@After
	public void tearDown() {
		this.Finalize();
	}
	
}
