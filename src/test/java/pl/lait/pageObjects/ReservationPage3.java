package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class ReservationPage3 {

	WebDriver driver;

	@FindBy(name = "passFirst0")
	WebElement nameInput;

	@FindBy(name = "passLast0")
	WebElement lastNameInput;

	@FindBy(name = "passFirst1")
	WebElement nameInput1;

	@FindBy(name = "passLast1")
	WebElement lastNameInput1;

	@FindBy(name = "pass.0.meal")
	WebElement meal;

	@FindBy(name = "creditCard")
	WebElement cardType;

	@FindBy(name = "creditnumber")
	WebElement cardNumber;

	@FindBy(name = "cc_exp_dt_mn")
	WebElement expirationMonth;

	@FindBy(name = "cc_exp_dt_yr")
	WebElement expirationYear;

	@FindBy(name = "cc_frst_name")
	WebElement cardNameInput;

	@FindBy(name = "cc_mid_name")
	WebElement cardMNameInput;

	@FindBy(name = "cc_last_name")
	WebElement cardLNameInput;

	@FindBy(name = "billAddress1")
	WebElement billAdress;

	@FindBy(name = "billCity")
	WebElement billCity;

	@FindBy(name = "billState")
	WebElement billState;

	@FindBy(name = "billZip")
	WebElement billZip;

	@FindBy(name = "billCountry")
	WebElement billCountry;

	@FindBy(name = "ticketLess")
	WebElement ticketLess;

	@FindBy(name = "buyFlights")
	WebElement buyFlights;

	public ReservationPage3() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void signingAs(String name, String lastName) {
		nameInput.sendKeys(name);
		lastNameInput.sendKeys(lastName);
	}

	public void signingAs1(String name1, String lastName1) {
		nameInput1.sendKeys(name1);
		lastNameInput1.sendKeys(lastName1);
	}

	public void mealChoice(String choice) {
		Select mealSelect = new Select(meal);
		mealSelect.selectByValue(choice);
	}

	public void cardChoice(String cardch) {
		Select cardSelect = new Select(cardType);
		cardSelect.selectByValue(cardch);
	}

	public void cardNumberFill(String cardNumb) {
		cardNumber.sendKeys(cardNumb);
	}

	public void monthExpiration(String expmon) {
		Select monthSelect = new Select(expirationMonth);
		monthSelect.selectByVisibleText(expmon);
	}

	public void yearExpiration(String expyear) {
		Select yearSelect = new Select(expirationYear);
		yearSelect.selectByVisibleText(expyear);
	}

	public void signingAsCard(String cardname, String cardmname, String cardlname) {
		cardNameInput.sendKeys(cardname);
		cardMNameInput.sendKeys(cardmname);
		cardLNameInput.sendKeys(cardlname);
	}
	public void adressclear () {
		billAdress.clear();
		billCity.clear();
		billState.clear();
		billZip.clear();
	}
	
	public void adressfill(String adressbill, String citybill, String statebill, String zip) {
		billAdress.sendKeys(adressbill);
		billCity.sendKeys(citybill);
		billState.sendKeys(statebill);
		billZip.sendKeys(zip);
	}

	public void countryChoice(String country) {
		Select countrySelect = new Select(billCountry);
		countrySelect.selectByValue(country);
	}
	
	public void ticketLessClick () {
		ticketLess.click();
	}
	
	public void buyFlightsClick () {
		buyFlights.click();
	}
}
