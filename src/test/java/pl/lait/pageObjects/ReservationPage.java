package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class ReservationPage {
	WebDriver driver;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayRadio;
	

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement roundTripRadio;

	@FindBy(name = "passCount")
	WebElement passCount;

	@FindBy(name = "fromPort")
	WebElement fromPort;

	@FindBy(name = "fromMonth")
	WebElement fromMonth;

	@FindBy(name = "fromDay")
	WebElement fromDay;

	@FindBy(name = "toPort")
	WebElement toPort;

	@FindBy(name = "toMonth")
	WebElement toMonth;

	@FindBy(name = "toDay")
	WebElement toDay;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
	WebElement CoachClassRadio;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement BusinesClassRadio;

	@FindBy(xpath = "//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement FirstClassRadio;

	@FindBy(name = "airLine")
	WebElement airline;

	@FindBy(name = "findFlights")
	WebElement findflightsBTN;

	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void oneWayRadioClick() {
		oneWayRadio.click();
	}

	public void roundTripRadio() {
		roundTripRadio.click();
	}

	public void passengersCount(String count) {
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue(count);
	}

	public void coachClassClick() {
		CoachClassRadio.click();
	}

	public void businessClassClick() {
		BusinesClassRadio.click();
	}

	public void firstClassClick() {
		FirstClassRadio.click();
	}

	public void departingFrom(String port) {
		Select departingFromSelect = new Select(fromPort);
		departingFromSelect.selectByValue(port);
	}

	public void on(String month, String day) {
		Select m = new Select(fromMonth);
		m.selectByValue(month);
		Select d = new Select(toDay);
		d.selectByValue(day);
	}

	/**
	 * <select name="airline"><br>
	 * No Preference<br>
	 * Blue Skies Airlines<br>
	 * Unified Airlines<br>
	 * Pangea Airlines<br>
	 * 
	 * @param line
	 */
	public void airline(String line) {
		Select l = new Select(airline);
		l.selectByVisibleText(line);
	}

	public void findflightsBTNClick() {
		findflightsBTN.click();
	}


}