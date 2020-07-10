package locators;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
    
	   WebDriver driver;
	
	@Before
	public  void launchBrowser() {
		
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://objectspy.space/");
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
   
	@Test
	public void locators() {
    	
// Id locator
    	//driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();  //Radio button-male
 
// name locator
    	//driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("abc");     //Last name
    	
// class locator
        //driver.findElement(By.className("input-file")).click();  // 'Choose File' element, this is not working
    	driver.findElement(By.className("inputs")).sendKeys("Hi"); // In Alert example, 'Enter name' element
    	
// link text locator
    	//driver.findElement(By.linkText("OS-API Product FrontEnd")).click(); // 'OS-ApI Product FrontEnd' link
      
// partial link text locator
       //  driver.findElement(By.partialLinkText("TF-API")).click();
      // driver.findElement(By.partialLinkText("OS-API")).click();   // 'OS-API' partial link
       
// CSS Selector locator (id)
       // driver.findElement(By.cssSelector("input#exp-2")).click();
    	driver.findElement(By.cssSelector("input#exp-4")).click();  // in Multiple Radio buttons, 5
      
   
// CSS Selector locator (class)
       // driver.findElement(By.cssSelector("input.input-file")).click();
        driver.findElement(By.cssSelector("input.search")).sendKeys("amazon"); // 'Search' element

// CSS Selector locator ( TagName[attribute='value']  )
      //  driver.findElement(By.cssSelector("input[value='Automation Tester']")).click(); 
        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("02/02/2020"); // 'date' element
        
// XPath locator    (    TagName[@ AttributeNode = 'value']    )
      // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("I love Selenium");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click(); // 'Automation Tester' check box
        
 // XPath locator   (  TagName[contains9text(),'value']    )
    //  driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'XML vs Excel')]")).click();  // In Useful Links, 'XML vs Excel'

// Xpath locator Absolute path for 'First name' element 
        driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[7]/input")).sendKeys("123"); //First name
	
	}
   
	@After
	public void tearDown() throws InterruptedException {
    	Thread.sleep(10000);
		driver.close();
    	//driver.quit();
    	System.out.println("hi"); //  u use close() or quit(), 'hi' will print.
    }


}
