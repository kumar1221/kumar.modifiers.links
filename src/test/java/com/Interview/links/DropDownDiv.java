package com.Interview.links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownDiv {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./DriverPaths/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/SignUp");
	}

	@Test
	public void divDrop() {
		driver.findElement(By.xpath("//*[@id='BirthMonth']/div")).click();
		driver.findElement(By.xpath("//*[@id=':8']/div")).click();
		
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(5000);
		driver.close();

	}
}
