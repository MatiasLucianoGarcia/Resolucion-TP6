package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import controls.Input;
import controls.Button;
public class LoginPage extends BasePage{

	public LoginPage() {
		super(By.xpath("//input[@value='LOGIN']"));
	}
	
	public Input inputUsername() {
		return new Input(By.id("user-name"));
	}
	
	public Input inputPassword() {
		return new Input(By.id("password"));
	}
	
	public Button btnLogin() {
		return new Button(By.xpath("//input[@value='LOGIN']"));
	}
}
