package clothingStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CottonKing {
  @Test
  public void CottonKingTest() throws InterruptedException 
  {
	   System.setProperty("webdriver.chrome.driver","F:\\Browesrs Data and selelium app down\\chromedriver-win64\\chromedriver.exe" );
	   WebDriver driver = new ChromeDriver();
		 Reporter.log("opening CottonKing", true);
		 driver.get("https://www.cottonking.com/");
		 Thread.sleep(5000);
		 driver.close();
  }
}
