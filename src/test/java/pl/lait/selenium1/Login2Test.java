package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.ReservationPage;
import pl.lait.pageObjects.SelectFlight;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login2Test {

	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
		System.out.println("wewnatrz openPage (before)");
		driver = Init.getDriver();
		System.out.println("wewnatrz openPage (koniec before)");
	}
	@Ignore
	@Test
	public void login() {
		System.out.println("wewnatrz testu - login");
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("skopau", "skopau123456789");
		System.out.println("koniec testu login");
	}

	@Test
	public void reservation() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("skopau", "skopau123456789");
	
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.roundTripRadio();
		Init.sleep(1);
		reservationPage.passengersCount("2");
		Init.sleep(1);
		reservationPage.passengersCount("3");
		reservationPage.departingFrom("London");
		reservationPage.on("11", "30");
		reservationPage.findflightsBTNClick();
		
		SelectFlight selectFlight = new SelectFlight();
		selectFlight.radio2click();
		selectFlight.raio6click();
		selectFlight.continueBtnClick();
		
		selectFlight.pass0meal("Hindu");
		
		Init.sleep(6);
		
		selectFlight.passenger0("Zdzich", "Pierdzioch");
		selectFlight.creditCard("MasterCard");
		selectFlight.creditNumber("12345678454563453");
		selectFlight.securePurchaseBtn();
		Init.sleep(10);
		
		
	}

	@After
	public void close() {
		System.out.println("wewnatrz klasy Login2Test - close");
		Init.endTest();
		System.out.println("wewnatrz klasy login2test - koniec close");
	}
}
