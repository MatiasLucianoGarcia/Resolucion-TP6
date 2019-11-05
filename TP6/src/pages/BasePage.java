package pages;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import driver.DriverManager;
import driver.DriverWrapper;
import junit.framework.Assert;


public class BasePage {
	protected By by;
	
	public BasePage(By findBy) {
		this.by=findBy;
	}

	protected WebDriver Driver() {
		return DriverManager.Instance().Driver();
	}
	
}


