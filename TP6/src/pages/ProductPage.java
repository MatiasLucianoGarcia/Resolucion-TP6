package pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import controls.Button;
import controls.Input;
import controls.Label;
import driver.DriverManager;

import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage{

	public ProductPage() {
		super(By.xpath("//div[contains(text(),'Products')]"));
	}
	
	public Label lblProduct() {
		return new Label(By.xpath("//div[contains(text(),'Products')]"));
	}
	
	public Button btnProduct(int index) {
		return new Button(By.xpath("//div[@class='inventory_list']/div["+index+"]/div[@class='pricebar']/button"));
	}
	
	public Button goToMyCart() {
		return new Button(By.xpath("//span[contains(@class, 'shopping_cart_badge')]"));
	}
	
	public Label myProduct(int index) {
		return new Label(By.xpath("//div[@class='cart_item']["+index+"]"));
	}
	
	public List<Button> getButons(){
		List<Button>cartButtons = new ArrayList<Button>();
		for (int i=1;i<=6;i++) {
			cartButtons.add(i-1, this.btnProduct(i));
		}
		return cartButtons;
	}
	
	public Button getCheckOutButton() {
		return new  Button(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")); 
	}
	
	public Input getFirtsName() {
		return new Input(By.xpath("//*[@id=\"first-name\"]"));
	}
	
	public Input getLastName() {
		return new Input(By.xpath("//*[@id=\"last-name\"]"));
	}
	
	public Input getZip() {
		return new Input(By.xpath("//*[@id=\"postal-code\"]"));
	}
	
	public Button getContinueButton() {
		return new Button(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
	}
	
	public Button getFinishButton() {
		return new Button(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]"));
	}
	
	public Label[] getLabelFinish(){
		Label [] etiquetasConfirmacion = new Label[2];
		etiquetasConfirmacion[0] = new Label(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
		etiquetasConfirmacion[1] = new Label(By.xpath("//*[@id=\"checkout_complete_container\"]/div[1]"));
		return etiquetasConfirmacion;
	}
}
