package stepDefinitions;

import java.awt.AWTException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp extends Instances{
	
	@Then("Tap on Sign up link")
	public void tap_on_sign_up_link() {
		loginPage.clickOnSignUpLink();
	}
	
	@And("Enter not existing email address")
	public void enter_not_existing_mail_address() {
		
		loginPage.setNotExistingSignUpValue();
	}
	@Then("Tap on Verify Email to Continue button")
	public void tap_on_verify_email_to_continue_button() {
		loginPage.clickOnVerifyEmailButton();
	}
	
	@When("Information message was shown")
	public void information_message_was_shown() throws InterruptedException, AWTException {
		
		loginPage.tabSwitching();
		
	}

	@Then("Navigate to yopmail page")
	public void navigate_to_yopmail_page() throws InterruptedException {
		yopMailPage.setYopEmail();
	}

	@Then("Enter not existing in promo email")
	public void enter_not_existing_in_promo_email() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigate to email mailbox")
	public void navigate_to_email_mailbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Copy OTP")
	public void copy_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter OTP in verification window")
	public void enter_otp_in_verification_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("OTP was approved")
	public void otp_was_approved() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigate to sign up Form")
	public void navigate_to_sign_up_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter all mandatory fields")
	public void enter_all_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Tap on Sign up button")
	public void tap_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
