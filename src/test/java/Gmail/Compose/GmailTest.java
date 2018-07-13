package Gmail.Compose;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GmailTest {
  WebDriver driver;
  
  @BeforeTest
  public void Browser() {
	 
  }
  
  @Test
  public void Gmail() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium1211\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http:\\www.gmail.com");
	  driver.manage().window().maximize();
	  //driver.findElement(By.xpath("//div[@id='identifierLink']//div[@class='vdE7Oc f3GIQ']")).click();
	  driver.findElement(By.xpath(("//input[@id='identifierId']"))).sendKeys("kesinenieswar11@gmail.com");
	  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='password']//input[@class='whsOnd zHQkBf']")).sendKeys("Kesineni1211");
	  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	  driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("sudheer.leapacademy@gmail.com");
	  driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Sir, This is PDF File");
	  driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
	  Runtime.getRuntime().exec("D:\\Selenium1211\\Scripts\\Gmail.exe");
	  Thread.sleep(15000);
	  driver.findElement(By.xpath("//div[text()='Send']")).click();
	  
  }

  @AfterTest
  public void Logout() {
	  
  }

}
