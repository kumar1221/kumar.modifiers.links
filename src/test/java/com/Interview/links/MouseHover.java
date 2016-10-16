package com.Interview.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utilities.links.BrowserUtility;

public class MouseHover extends BrowserUtility {

	@Test
	public void testMouseHover() throws Exception {
    driver.get("http://www.naukri.com");
    Actions builder = new Actions(driver);
    WebElement ele = driver.findElement(By.xpath("//body/div[2]/div/ul/li[1]/a"));
    builder.moveToElement(ele).perform();
    Thread.sleep(5000);
    WebElement ele1 = driver.findElement(By.xpath("html/body/div[2]/div/ul/li[1]/div/ul[1]/li[2]/a"));
    builder.moveToElement(ele1).perform();
    Thread.sleep(5000);
    builder.click(ele1).perform();
	}
}
