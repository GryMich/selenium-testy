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
import pl.lait.pageObjects.ReservationPage2;
import pl.lait.pageObjects.ReservationPage3;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Login2Test {

	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Ignore 
	@Test
	public void reservation() {
		// 1 - otwieramy przeglądarke i logujemy się do aplikacji
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("Bobek", "bobek");
		Init.sleep(9);
		// 2 - na pierwszym ekranie po zalogowaniu się wypełniam formularz rezerwacji
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.oneWayRadioClick();
		reservationPage.roundTripRadioClick();
		reservationPage.passengersCount("2");
		reservationPage.departingFrom("Acapulco");
		reservationPage.fromDay("2");
		reservationPage.fromMonth("11");
		reservationPage.departingto("Frankfurt");
		reservationPage.to("11", "10");
		reservationPage.firstClassRadioClick();
		reservationPage.preferedAirline("Blue Skies Airlines");
		Init.sleep(9);
		reservationPage.findFlights();
		ReservationPage2 reservationPage2 = new ReservationPage2();
		reservationPage2.outFlight0Click();
		reservationPage2.outFlight1Click();
		reservationPage2.outFlight2Click();
		reservationPage2.outFlight3Click();
		reservationPage2.inFlight0Click();
		reservationPage2.inFlight1Click();
		reservationPage2.inFlight2Click();
		reservationPage2.inFlight3Click();
		reservationPage2.reserveFlights();
		
		ReservationPage3 rp3 = new ReservationPage3();
		rp3.signingAs("Andrzej", "Andrzejowski");
		rp3.signingAs1("Jacek", "Jackowski");
		rp3.mealChoice("BLML");
		rp3.cardChoice("IK");
		rp3.cardNumberFill("1234567891234567");
		rp3.monthExpiration ("02");
		rp3.yearExpiration("2010");
		rp3.signingAsCard("Andrzej", "Bolek", "Andrzejowski");
		Init.sleep(9);
		rp3.adressclear();
		rp3.adressfill("Szambiarska", "Gnojewo", "Nawozowskie", "32192");
		rp3.countryChoice("178");
		rp3.ticketLessClick();
		rp3.buyFlightsClick();
		Init.sleep(500);
	}
	/*
	 * @Test public void reservation2 () { ReservationPage2 reservationPage2 = new
	 * ReservationPage2(); reservationPage2.outFlight0Click();
	 * reservationPage2.outFlight1Click(); reservationPage2.outFlight2Click();
	 * reservationPage2.outFlight3Click(); reservationPage2.inFlight0Click();
	 * reservationPage2.inFlight1Click(); reservationPage2.inFlight2Click();
	 * reservationPage2.inFlight3Click(); reservationPage2.reserveFlights(); }
	 */

	@After
	public void close() {
		Init.endTest();
	}
}
