package pl.lait.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {

	static WebDriver driver;

	public static WebDriver getDriver() {
		System.out.println("wewnatrz getDriver");
		System.setProperty("webdriver.chrome.driver", "C://lait//cwiczenia selenium/chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");

			if(driver==null) {
				driver = new ChromeDriver();
				System.out.println("get http...");
				driver.get("http://newtours.demoaut.com");
				return driver;
			} else {
				return driver;
			}
			
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//sleep(2);
	}

	public static void endTest() {
		System.out.println("wewnatrz endTest");
		driver.quit();
		driver = null;
		System.out.println("po endTest");
	}

	public static WebDriver sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
	}
}