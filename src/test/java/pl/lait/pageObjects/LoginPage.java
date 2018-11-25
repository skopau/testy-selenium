package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium1.Init;

public class LoginPage {

	WebDriver driver;
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(name = "userName")
	WebElement loginInput;
	@FindBy(name = "password")
	WebElement passwdInput;
	@FindBy(name = "login")
	WebElement loginBtn;
	
	public LoginPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	} 
	public void goToLoginPage() {
		signOnLink.click();
		
	/**
	 * Loguje mi się jako user z danymi przekazanymi w parametrach
	 */
	}
	public void loginAs(String login, String pass) {
		loginInput.sendKeys(login);
		passwdInput.sendKeys(pass);
		loginBtn.click();
	}}
	
