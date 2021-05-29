package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginClass {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Driver Set and ready to Launch");
	}

	@Test(priority = 1)
	public void loginClass() throws InterruptedException {
		System.out.println("Driver launched");
		System.out.println("Login test");
		driver.get("https://google.com/");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Driver performs operation");
	}

	@Test(priority = 0)
	public void sampleProgram() {
		System.out.println("Test 2");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Driver is going to kill itself");
		driver.quit();
		System.out.println("Driver  dead body found !! Oh call the police");
	}
}
