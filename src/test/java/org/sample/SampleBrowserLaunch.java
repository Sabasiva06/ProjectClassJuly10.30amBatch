package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleBrowserLaunch {
	public static WebDriver driver;
	// Integration of baseclass with selnium in junit

	@BeforeClass // --> It will execute for only one time in a class
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\3PmFrameWorkBatch\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void tc01() {

		WebElement txtUserNamee = driver.findElement(By.id("email"));
		txtUserNamee.sendKeys("WelcomeJava");
		String attribute = txtUserNamee.getAttribute("value");
		Assert.assertEquals("Verify UserName", attribute, "WelcomeJava");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hijavaa");
		String attribute2 = txtPassword.getAttribute("value");
		Assert.assertEquals("Verify Password", attribute2, "Hijavaa");
		WebElement btnLoggin = driver.findElement(By.name("login"));
		boolean enabled = btnLoggin.isEnabled();
		Assert.assertTrue("Login Button verification", enabled);
		btnLoggin.click();

	}

	@Test
	public void tc02() {
		WebElement txtUserNamee = driver.findElement(By.id("email"));
		txtUserNamee.sendKeys("WelcomeJava");
		String attribute = txtUserNamee.getAttribute("value");
		Assert.assertEquals("Verify UserName", attribute, "WelcomeJava");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hijavaa");
		String attribute2 = txtPassword.getAttribute("value");
		Assert.assertEquals("Verify Password", attribute2, "Hijavaa");
		WebElement btnLoggin = driver.findElement(By.name("login"));
		boolean enabled = btnLoggin.isEnabled();
		Assert.assertTrue("Login Button verification", enabled);
		btnLoggin.click();

	}

}
