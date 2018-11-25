package pl.lait.selenium1;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.Select;

/**
 * ZA POMOCĄ ŚREDNIKA I DWÓCH GWIAZDEK MOŻNA PISAĆ TAKIE KOMENTARZE
 * @author ppp
 *FIX METHOD ORDER.. SORTUJE NAM TESTY PO KOLEI
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginTest {
	WebDriver driver = null;
	@Before
	public void openPage() {
		driver = Init.getDriver();}
/**
 * PODZIELILIŚMY TEST WCZESNIEJSZY NA DWA OSOBNE. 
 * PIERWSZY KLKANIE PO MENU, DRUGI LOGOWANIE
 */
	@Test
	public void clickOnMenuIems() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click(); 
		
	}
	
	@Ignore
	
	@Test
	public void login() {
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("skopau");
		driver.findElement(By.name("password")).sendKeys("skopau123456789");
		driver.findElement(By.name("login")).click(); 
		

		/**
		 * page object, przenosi strone do klasy w kodach, kazdy przycisk to bylby przycisk w kodzie
		 * 
		 * xpath wklejamy jesli nie mozemy zlokalizowac elementu po nazwie elementu, bo np. sie powtarzaja
		 */
		String round_trip = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
		String one_way = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		
		driver.findElement(By.xpath(round_trip)).click();
		driver.findElement(By.xpath(one_way)).click();
		
		Select pass_count = new Select(driver.findElement(By.name("passCount")));
		pass_count.selectByValue("2");
		
		Init.sleep(5);
	}
	
	
	/**
	 * DZIĘKI TEMU ŻE MAMY PO AFTER KOMENDE ZAMKNIJ PRZEGLADARKE, 
	 * TO PO KAZDYM TESCIE NAM ZAMYKA PRZEGLĄDARKE I OTWIERA NA NOWO, DZIEKI CZEMU NP. NIE ZUŻYWA NA RAMU 
	 */
	@After
	public void close(){
		Init.endTest();
	}}