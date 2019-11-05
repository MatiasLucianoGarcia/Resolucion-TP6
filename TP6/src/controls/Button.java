package controls;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class Button extends BaseControl  {
	
	public Button(By by) {
		super(by);
	}
	
	public String Text() {
		try {
			return this.Element().getText();
		} catch (NoSuchElementException e){
			return null;
		}
	}
	
	public void click() {
		this.Element().click();
	}
}