package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.ReservationPage;
import pl.lait.selenium1.Init;

public class LoginPageStepDefs {

	WebDriver driver = null;
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
		driver = Init.getDriver();
	}

	@When("^I fill the login form with login \"([^\"]*)\" and pass \"([^\"]*)\"$")
	public void i_fill_the_login_form_with_login_and_pass(String arg1, String arg2) throws Throwable {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs(arg1, arg2);
	}

	@Then("^I should see flight reservation form$")
	public void i_should_see_flight_reservation_form() throws Throwable {
	
	}
	@When("^I click on radiobutton round trip$")
	public void i_click_on_radiobutton_round_trip() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.roundTripRadioClick();
	}

	@When("^I select number of passengers$")
	public void i_select_number_of_passengers() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.passengersCount("2");
	}

	@When("^I select departing from list$")
	public void i_select_departing_from_list() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.departingFrom("Acapulco");
	}

	@When("^I select month from list$")
	public void i_select_month_from_list() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.fromMonth("11");
	}

	@When("^I select day from list$")
	public void i_select_day_from_list() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.fromDay("2");
	}

	@When("^I select arriving in list$")
	public void i_select_arriving_in_list() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.departingto("Frankfurt");
	}

	@When("^I select returning month and day$")
	public void i_select_returning_month() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.to("11", "10");
	}

	
	@When("^I select on radiobutton first class$")
	public void i_select_on_radiobutton_first_class() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.firstClassRadioClick();
	}

	@When("^I select airline from list$")
	public void i_select_airline_from_list() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.preferedAirline("Blue Skies Airlines");
	}

	@When("^I click contiunue button$")
	public void i_click_contiunue_button() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.findFlights();
	}

	@Then("^I should see select flight form$")
	public void i_should_see_select_flight_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
