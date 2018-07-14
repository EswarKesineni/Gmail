package Gmail.Compose;

import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoggerTest {
	WebDriver driver;
  @Test
  public void Logger() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium1211\\chromedriver.exe");
	  driver = new ChromeDriver();
	  org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("LoggerTest");
	  PropertyConfigurator.configure("log4j.properties");
	  log.info("Browser Starting");
	  driver.navigate().to("http:\\www.cricbuzz.com");
	  log.info("The Url Launched");
	  driver.manage().window().maximize();
	  log.info("The Browser Maximized");
	  driver.quit();
	  log.info("The Browser Has Exited");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
