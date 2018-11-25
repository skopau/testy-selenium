package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.LoginPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login2Test {

	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}

	@Test
	public void login() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("skopau", "skopau123456789");

		
		
		
	}

	
	@Test
	public void reservation() {
		
	}
	
	

	@After
	public void close() {
		Init.endTest();
	}
}
