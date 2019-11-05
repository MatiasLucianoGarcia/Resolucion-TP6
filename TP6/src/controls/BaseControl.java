package controls;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverManager;
import driver.DriverWrapper;

public class BaseControl {
	protected By by;

	public BaseControl(By findBy) {
		this.by=findBy;
	}

	protected WebDriver Driver() {
		return DriverManager.Instance().Driver();
	}
	
	protected WebElement Element() {
		try {
			return this.Driver().findElement(this.by);
		}catch(NoSuchElementException e) {
			return null;
		}
	}
	
	public boolean Visible() {
		try {
			return DriverWrapper.IsVisible(this.by);
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean Enabled() {
		try {
			return DriverWrapper.IsEnable(this.by);
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public void click() {
		// TODO Auto-generated method stub
		
	}
	
	public String Text() {
		return null;
	}
	
	
	
	public String getBy() {
		return by.toString();
	}
	
}
