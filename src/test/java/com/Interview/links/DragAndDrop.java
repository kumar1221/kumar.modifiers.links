package com.Interview.links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	WebDriver driver;

	@Test
	public void setup() throws Exception {
		/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();*/
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dice.com/jobs/advancedSearch.html");
		Actions act = new Actions(driver);
		WebElement daySlider = driver.findElement(By.xpath("//*[@id='postedDateS']/a"));
		WebElement itemSlider = driver.findElement(By.xpath("//*[@id='limitS']/a"));
		act.dragAndDropBy(daySlider, -600, 0).build().perform();
		Thread.sleep(2000);
		act.dragAndDropBy(itemSlider, 500, 0).build().perform();
		Thread.sleep(2000);
		driver.close();

	}

}
