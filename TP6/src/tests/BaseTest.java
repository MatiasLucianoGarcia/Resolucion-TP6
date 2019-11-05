package tests;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverManager;
import junit.framework.Assert;

public class BaseTest {

	private WebDriver driver;
	
	public BaseTest() {
		this.driver= DriverManager.Instance().Driver();
		
		this.driver.get("https://www.saucedemo.com/");
	}
	
	protected WebDriver Driver() {
		return this.driver;
	}
	
	public void Finalize() {
		DriverManager.Instance().CloseDriver();
	}
	
}
