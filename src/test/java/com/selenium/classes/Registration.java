package com.selenium.classes;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void registration() throws Exception {
		driver.navigate().to("http://demoqa.com/registration/");
		driver.findElement(By.id("name_3_firstname")).sendKeys("toolsqa firstname");
		driver.findElement(By.id("name_3_lastname")).sendKeys("last_name");

		WebElement check_box = driver.findElement(By.xpath("//input[@value='dance']"));
		boolean check_box_status = check_box.isSelected();

		System.out.println("status of checkbox :" + check_box_status);
		Thread.sleep(2000);
		check_box.click();

		boolean check_box_status_new = check_box.isSelected();
		System.out.println("status of checkbox :" + check_box_status_new);

	}

	@Test(dependsOnMethods = "registration")
	public void radioButtonsList() {
		List<WebElement> radio_list = driver.findElements(By.name("radio_4[]"));
		for (int i = 0; i < radio_list.size(); i++) {
			WebElement radio = radio_list.get(i);
			String radio_value = radio.getAttribute("value");
			if (radio_value.equalsIgnoreCase("Divorced")) {
				radio.click();
				break;
			}
		}
	}

	@Test(dependsOnMethods = "radioButtonsList")
	public void radioButtonsIterator() {
		// List<WebElement> radio_list_1 =
		// driver.findElements(By.name("radio_4[]"));

		Iterator<WebElement> radio_button_iterator = driver.findElements(By.name("radio_4[]")).iterator();
		while (radio_button_iterator.hasNext()) {
			WebElement radio_value_1 = radio_button_iterator.next();
			if (radio_value_1.getAttribute("value").equalsIgnoreCase("single")) {
				radio_value_1.click();
			}
		}
	}
	
	@Test(dependsOnMethods="radioButtonsIterator")
	public void countryIterator(){
		Select country = new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		System.out.println("the first selected value is :" +country.getFirstSelectedOption().getText());
		System.out.println("the first selected value is :" +country.getFirstSelectedOption().getAttribute("value"));
		
		Iterator<WebElement> country_iterator =  driver.findElements(By.xpath("select[@id='dropdown_7']")).iterator();
		while(country_iterator.hasNext()){
			System.out.println("The list of countries is : "+ country_iterator.next().getText());
		}
		
		
	    	
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();

	}

}
