package controls;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class Label extends BaseControl{
	
	public Label(By by) {
		super(by);
	}
	
	public String Text() {
		try {
			return this.Element().getText();
		} catch (NoSuchElementException e){
			return null;
		}
	}

}
