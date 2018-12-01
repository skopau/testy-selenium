package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

import org.openqa.selenium.support.FindBy;

public class SelectFlight {
	WebDriver driver;
	

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[5]/td/form/table[1]"
			+ "/tbody/tr[5]/td[1]/input")
	WebElement radio2;

	@FindBy (xpath="/html/body/div/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[5]/td/form/table[2]"
			+ "/tbody/tr[5]/td[1]/input")
	WebElement radio6;
	
	@FindBy(name = "reserveFlights")
	WebElement continueBtn;
	
	
	// ---2poziom rezerwacji START----
	public void radio2click() {
		radio2.click();
	}
	public void raio6click() {
		radio6.click();
	}
	public void continueBtnClick() {
		continueBtn.click();
	}
	
	// ---2poziom rezerwacji END----
	// ---3poziom rezerwacji Start---
	
	@FindBy(name = "passFirst0")
	WebElement firstname;
	
	@FindBy(name = "passLast0")
	WebElement lastname;
	
	@FindBy (name = "pass.0.meal")
	WebElement meal;
	
	@FindBy (name="creditCard")
	WebElement creditCard;
	
	@FindBy (name="creditnumber")
	WebElement creditNumber;
	
	@FindBy (name="cc_exp_dt_mn")
	WebElement expirationDay;
	
	@FindBy (name="cc_exp_dt_yr")
	WebElement expirationYear;
	
	@FindBy (name="cc_frst_name")
	WebElement firstnameCC;
	
	@FindBy (name="cc_mid_name")
	WebElement middleCC;
	
	@FindBy (name="cc_last_name")
	WebElement lastnameCC;
	
	@FindBy (name="ticketLess")
	WebElement ticketlessTravel;
	
	@FindBy (name="billAddress1")
	WebElement billAddress;
	
	@FindBy (name="billCity")
	WebElement billCity;
	
	@FindBy (name="billState")
	WebElement billState;
	
	@FindBy (name="billZip")
	WebElement billZip;
	
	@FindBy (name="billCountry")
	WebElement billCountry;
	
	@FindBy(name="buyFlights")
	WebElement securePurchaseBtn;
	
	public SelectFlight() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void pass0meal(String posilek) {
		Select pass0meal = new Select(meal);
		pass0meal.selectByVisibleText(posilek);
	}
	
	public void passenger0 (String firstName, String lastName) {
		this.firstname.sendKeys(firstName);
		this.lastname.sendKeys (lastName);
	}
	
	public void creditCard (String name) {
		Select c = new Select(creditCard);
		c.selectByVisibleText(name);
	}
	public void creditNumber (String number) {
		creditNumber.sendKeys(number);
	}
	
	public void securePurchaseBtn () {
		securePurchaseBtn.click();
	}
	
	// ---3poziom rezerwacji END----
	
	
}