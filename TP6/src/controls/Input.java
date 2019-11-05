package controls;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class Input extends BaseControl {
	
	public Input(By by) {
		super(by);
	}
	
	public String Text() {
		try {
			return this.Element().getText();
		} catch (NoSuchElementException e){
			return null;
		}
	}
	
	public void Write(String text) {
		this.Element().clear();
		this.Element().sendKeys(text);
	}
	
	public String getAtribute(String text) {
		try {
			return this.Element().getAttribute(text);
		} catch (NoSuchElementException e){
			return null;
		}
	}
}
