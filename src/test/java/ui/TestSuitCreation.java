/**
 * 
 */
package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Ghost
 *
 */
public class TestSuitCreation {

	static WebDriver driver;

	@Test(priority = 0)
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void operation() {
		driver.get("http://localhost/lims");
	}

	@Test(priority = 2)
	public void closeEverything() {
		driver.close();
	}
}
