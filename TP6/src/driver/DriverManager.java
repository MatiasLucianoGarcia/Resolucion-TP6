package driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class DriverManager {
	private WebDriver activeDriver;
	
	private DriverManager() {}
	
	private static DriverManager instance;
	
	public static DriverManager Instance() 
	{
		if (instance==null) {
			instance = new DriverManager();
		}
		
		return instance;
		
	}
	
	public WebDriver Driver() {
		if (this.activeDriver == null) {
			String driverPath = System.getProperty("user.dir") + "/driver/chromedriver.exe";		
			System.setProperty("webdriver.chrome.driver", driverPath);
			this.activeDriver = new ChromeDriver();
			this.activeDriver.manage().window().maximize();
		}
		
		return this.activeDriver;
	}
	
	public void CloseDriver() {
		this.activeDriver.close();
		this.activeDriver.quit();
		this.activeDriver=null;
	}
}
