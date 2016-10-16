package com.Interview.links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./DriverPaths/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ksrtc.in/oprs-web/");
	}

	@Test
	public void acceptAlert() throws Exception {
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println("The Alert Message is :" + alertText);
		Assert.assertTrue(true, "Please select start place");
		driver.switchTo().alert().accept();
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
}
