package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider = "dataset")
	public void test(String name1, String name2) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys(name1);
		driver.findElement(By.id("password")).sendKeys(name2);
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(4000);
		driver.close();
	}

	@org.testng.annotations.DataProvider
	public Object dataset() {
		Object[][] dataset = new Object[2][2];

		// first row
		dataset[0][0] = "standard_user";
		dataset[0][1] = "secret_sauce";

		// Seond
		dataset[1][0] = "locked_out_user";
		dataset[1][1] = "secret_sauce";

		return dataset;
	}
}
