package locators;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementANDLocator {
	WebDriver driver;

	@Test
	public void lauch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.techfios.com/ibilling/?ng=admin/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// find by Webelement

		WebElement USERNAME_ELEMENT = driver.findElement(By.id("username"));
		USERNAME_ELEMENT.sendKeys("demon@techfios.com");
		Thread.sleep(2000);
		USERNAME_ELEMENT.clear();

		// OR find By locator

		By USERNAME_lOCATOR = (By.id("username"));
		driver.findElement(USERNAME_lOCATOR).sendKeys("demo@techfios.com");

		// find by Webelement

		WebElement PASSWORD_ELEMENT = driver.findElement(By.id("password"));
		PASSWORD_ELEMENT.sendKeys("abc12345");
		Thread.sleep(2000);
		PASSWORD_ELEMENT.clear();

		// OR find By locator

		By PASSWORD_LOCATOR = By.id("password");
		driver.findElement(PASSWORD_LOCATOR).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
