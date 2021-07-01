package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	private void tc10() {

		System.setProperty("webdriver.chrome.driver", "D:\\3PmFrameWorkBatch\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	private void tc20() {
		System.setProperty("webdriver.chrome.driver", "D:\\3PmFrameWorkBatch\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	private void tc30() {
		System.setProperty("webdriver.chrome.driver", "D:\\3PmFrameWorkBatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}


}
