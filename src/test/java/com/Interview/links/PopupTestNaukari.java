package com.Interview.links;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopupTestNaukari {

	WebDriver driver;

	@BeforeTest
	public void startBrowser() {

		/*System.setProperty("webdriver.chrome.driver",
				"D:\\Projects\\com.Interview.links\\DriverPaths\\chromedriver.exe");
		driver = new ChromeDriver();*/
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com/");
	}

	@Test
	public void testPopup() {
		// it will return parent window as string
		String parent_Window = driver.getWindowHandle();

		// it will return the no of windows opened by WebDriver and will write
		// set of strings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> i1 = s1.iterator();
	
		while (i1.hasNext()) {
			String child_window = i1.next();
			if (!parent_Window.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent_Window);
	}

	@AfterTest
	public void closeDriver() throws Exception {
		Thread.sleep(3000);
		driver.close();

	}

}
