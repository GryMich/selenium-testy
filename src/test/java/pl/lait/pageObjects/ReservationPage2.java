package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class ReservationPage2 {

	WebDriver driver;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input")
	WebElement outFlight0;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")
	WebElement outFlight1;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement outFlight2;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")
	WebElement outFlight3;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input")
	WebElement inFlight0;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
	WebElement inFlight1;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")
	WebElement inFlight2;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")
	WebElement inFlight3;

	@FindBy(name = "reserveFlights")
	WebElement reserveFlights;

	public ReservationPage2() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	public void outFlight0Click () {
		outFlight0.click();
	}
	
	public void outFlight1Click () {
		outFlight1.click();
	}
	
	public void outFlight2Click () {
		outFlight2.click();
	}
	
	public void outFlight3Click () {
		outFlight3.click(); 
	}
	public void inFlight0Click () {
		inFlight0.click();
	}
	
	public void inFlight1Click () {
		inFlight1.click();
	}
	
	public void inFlight2Click () {
		inFlight2.click();
	}
	
	public void inFlight3Click () {
		inFlight3.click(); 
	}
	
	public void reserveFlights() {
		reserveFlights.click();
	}
}