package clothingStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Raymond {
  @Test
  public void RaymondTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver ();
		 Reporter.log("opening Raymond", true);
		 driver.get("https://www.raymond.in/");
		 Thread.sleep(5000);
		 driver.close();
  }
}
                                                                      