/**
 * 
 */
package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Ghost
 *
 */
public class VerifyTitleTest {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Driver Set and ready to Launch");
	}

	@Test(groups = "Seriously")
	public void verifyTitleHardAssert() {
		String expectedTitle = "Medicio landing page template for Health niche";
		driver.get("http://localhost/lims/");
		String actualTitle = driver.getTitle();
		// HardAssert
		System.out.println("Hard Assert");
		Assert.assertEquals(actualTitle, expectedTitle, "Verified Successfull");
		System.out.println("Hard Assert completed");
	}

	@Test(groups = { "Seriously", "manage" })
	public void verifyTitleSoftAssert() {
		String expectedTitle = "Medicio landing page template for Health niche";
		driver.get("http://localhost/lims/");
		String actualTitle = driver.getTitle();
		// SoftAssert
		SoftAssert sftasrt = new SoftAssert();
		System.out.println("softAssert Started");
		sftasrt.assertEquals(actualTitle, expectedTitle, "Not verified but Oky");
		System.out.println("Soft assert completed");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Driver is going to kill itself");
		driver.quit();
		System.out.println("Driver  dead body found !! Oh call the police");
	}
}
