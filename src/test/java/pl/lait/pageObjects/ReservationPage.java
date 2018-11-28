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
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement firstClass;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void oneWayRadioClick() {
		oneWayRadio.click();
	}
	public void roundTripRadioClick() {
		roundTripRadio.click();
	}
	public void passengersCount(String count) {
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue(count);
	}
	public void departingFrom (String depFrom) {
		Select fromPortSelect = new Select (fromPort);
		fromPortSelect.selectByVisibleText(depFrom);
	}
	public void fromMonth (String monthFrom) {
		Select fromMonthSelect = new Select (fromMonth);
		fromMonthSelect.selectByVisibleText(monthFrom);
	}
	public void fromDay (String dayFrom) {
		Select fromDaySelect = new Select(fromDay);
		fromDaySelect.selectByValue(dayFrom);
	}
	public void departingto (String depto) {
		Select toPortSelect = new Select (toPort);
		toPortSelect.selectByVisibleText(depto);
	}
	public void toMonth (String monthTo) {
		Select toMonthSelect = new Select (toMonth);
		toMonthSelect.selectByVisibleText(monthTo);
	}
	public void toDay (String dayTo) {
		Select toDaySelect = new Select(toDay);
		toDaySelect.selectByValue(dayTo);
	}
	public void firstClassRadioClick() {
		firstClass.click();
	}
	public void preferedAirline (String prefAirline) {
		Select preferedAirlineSelect = new Select (airline);
		preferedAirlineSelect.selectByVisibleText(prefAirline);
	}
}

