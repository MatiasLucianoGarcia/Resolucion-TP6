package tests;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controls.Button;
import controls.Label;
import pages.LoginPage;
import pages.PersonGeneratorPage;
import pages.ProductPage;

public class FinalPurchaseTest extends BaseTest {
	private LoginPage loginPage;
	private ProductPage productPage;
	private PersonGeneratorPage personGeneratorPage; 
 	
	public FinalPurchaseTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{}
	
	@Test
	public void verifyVisibilityOfAllElements() throws Exception{
		loginPage = new LoginPage();
		productPage = new ProductPage();
		personGeneratorPage = new PersonGeneratorPage();
		
		this.Driver().get("https://www.fakepersongenerator.com/Index/generate");
		
		String [] nombreCortado = this.personGeneratorPage.getName().Text().split(" ");
		String [] zipCortado = this.personGeneratorPage.getZip().Text().split(" ");
		String firstName = nombreCortado[0];
		String lastName= nombreCortado[nombreCortado.length-1];
		String zip = zipCortado[zipCortado.length-1];
		
		this.Driver().get("https://www.saucedemo.com/");
		
		this.loginPage.inputUsername().Write("standard_user");
		this.loginPage.inputPassword().Write("secret_sauce");
		this.loginPage.btnLogin().click();
		
		
		this.productPage.getButons().get(((int)Math.random()*6)).click();
		
		this.productPage.goToMyCart().click();
		this.productPage.getCheckOutButton().click();
		
		this.productPage.getFirtsName().Write(firstName);
		this.productPage.getLastName().Write(lastName);
		this.productPage.getZip().Write(zip);
		
		this.productPage.getContinueButton().click();
		
		this.productPage.getFinishButton().click();
		
		Label [] finalLabels=this.productPage.getLabelFinish();
		
		Assert.assertTrue(finalLabels[0].Visible());
		Assert.assertTrue(finalLabels[1].Visible());
		Assert.assertEquals(finalLabels[0].Text(), "THANK YOU FOR YOUR ORDER");
		Assert.assertEquals(finalLabels[1].Text(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		

		
	}
	
	@After
	public void tearDown() {
		this.Finalize();
	}

}
