package clothingStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CottonKing {
  @Test
  public void CottonKingTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver ();
		 Reporter.log("opening CottonKing", true);
		 driver.get("https://www.cottonking.com/");
		 Thread.sleep(5000);
		 driver.close();
  }
}
