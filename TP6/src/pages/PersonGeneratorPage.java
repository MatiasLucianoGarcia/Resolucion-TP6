package pages;

import org.openqa.selenium.By;

import controls.Button;
import controls.Label;

public class PersonGeneratorPage extends BasePage{

	public PersonGeneratorPage() {
		super(By.xpath("/html/body/div[2]/div[2]/div[1]/p"));
	}
	
	public Button getGenerateButton() {
		return new Button(By.xpath("//*[@id=\"generate\"]"));
	}
	
	public Label getName() {
		return new Label(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/p/b"));
	}
	
	
	public Label getZip() {
		return new Label(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[2]/p[5]/b"));
	}
}
