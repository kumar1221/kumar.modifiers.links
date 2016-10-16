package com.Interview.links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DateDynamic {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "./DriverPaths/chromedriver.exe"); driver = new ChromeDriver();
		 */
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
	}

	@Test
	public void dynamicDateSelection() {

		try {
			 driver.switchTo().frame("0");
			driver.findElement(By.xpath("//div[@class='modalCloseSmall']")).click();
			driver.switchTo().defaultContent();
			
			
		} catch (NoSuchFrameException e) {
			System.out.println("The Exception is : " + e.getMessage());
		}
		driver.findElement(By.xpath(".//*[@id='txtOnwardCalendar']")).click();
		List<WebElement> dates = driver
				.findElements(By.xpath("//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr/td"));
		int date_nodes = dates.size();
		for (int i = 0; i < date_nodes; i++) {
			String totalDates = dates.get(i).getText();
			if (totalDates.equals(30)) {
				dates.get(i).click();
				break;
			}
		}
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();

	}
}
