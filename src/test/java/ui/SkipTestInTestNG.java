/**
 * 
 */
package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Ghost
 *
 */
public class SkipTestInTestNG {
	static WebDriver driver;

	@BeforeTest
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void operation1() {
		driver.get("http://google.com/");
		System.out.println("Print Operation is called");
	}

	@Test(enabled = false)
	public void operation2() throws InterruptedException {
		String title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("Print Operation 2 is called and Page title is =" + title);
	}

	@Test
	public void operation3() {
		String TextSrc = driver.getCurrentUrl();
		System.out.println("Print Operation 3 is called and current URL is =" + TextSrc);
	}

	@AfterTest
	public void closeEverything() {
		driver.close();
	}
}
