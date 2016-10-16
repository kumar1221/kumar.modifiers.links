package com.Interview.links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinks {

	WebDriver driver;
	String url;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./DriverPaths/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.dice.com/");
	}

	@Test
	public void countLinks() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Totla links are : " + links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			System.out.println("links.get(i) is :" + ele);
			url = ele.getAttribute("href");
			verifyLinks(url);
		}
	}

	/* @Test(dependsOnMethods=("countLinks")) */
	public void verifyLinks(String linkurl) {
		try {
			URL url = new URL(linkurl);
			HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
			urlConnect.setConnectTimeout(5000);
			urlConnect.connect();
			if (urlConnect.getResponseCode() == 200) {
				System.out.println(linkurl + " - " + urlConnect.getResponseMessage());
			} else if (urlConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(
						linkurl + " - " + urlConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			System.out.println("The Exception is" + e.getMessage());
		}
	}

	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
}
