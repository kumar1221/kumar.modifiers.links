package com.Interview.links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownSelect {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./DriverPaths/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@Test()
	public void dropDown() throws Exception {
		
		driver.findElement(By.xpath("//*[@id='day']")).click();
		driver.findElement(By.xpath("//*[@id='day']/option[14]")).click();

		Select day = new Select(driver.findElement(By.id("day")));
		WebElement daySelected = day.getFirstSelectedOption();
		System.out.println("The first selected day option is : " + daySelected.getText());
		day.selectByValue("16");
		WebElement daySelected1 = day.getFirstSelectedOption();
		System.out.println("The last selected day option is : " +daySelected1.getText());
		Thread.sleep(2000);

		Select month = new Select(driver.findElement(By.id("month")));
		WebElement monthSelected = month.getFirstSelectedOption();
		System.out.println("The first selected month option is : " + monthSelected.getText());
		month.selectByVisibleText("Aug");
		WebElement monthSelected1 = month.getFirstSelectedOption();
		System.out.println("The last selected month option is : " + monthSelected1.getText());
		Thread.sleep(2000);
		
		List<WebElement> month_list = month.getOptions();
		int total_months = month_list.size();
		System.out.println("The total no of months is :"+total_months);
		for(WebElement ele : month_list){
			System.out.println("Month Name is : "+ ele.getText());
		}

		Select year = new Select(driver.findElement(By.id("year")));
		WebElement yearSelected = year.getFirstSelectedOption();
		System.out.println("The first selected year option is : " + yearSelected.getText());
		year.selectByVisibleText("1990");
		WebElement yearSelected1 = year.getFirstSelectedOption();
		System.out.println("The last selected year option is : " + yearSelected1.getText());
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
