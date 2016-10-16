package selenium.grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;


public class TestBrowserStack {

	  public static final String USERNAME = "satish242";
	  public static final String AUTOMATE_KEY = "13JkGAWmDbjfdARr43m8";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./DriverPaths/chromedriver.exe");  
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setPlatform(Platform.MAC);
	    caps.setCapability("browserstack.debug", "true");

	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }
	}
 