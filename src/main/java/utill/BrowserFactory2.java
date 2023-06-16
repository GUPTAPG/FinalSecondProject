package utill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory2 {
static WebDriver driver;

public static WebDriver init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyagupta\\Sept23_Selenium\\FinalProject2\\driver\\chromedriver.exe");
	driver= new ChromeDriver ();
	driver.manage().deleteAllCookies();
	driver.get(" http://techfios.com/test/101/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
}
public static void teardown() {
	driver.close();
	driver.quit();
}



}
