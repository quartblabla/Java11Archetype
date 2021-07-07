package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ValidLogin extends Instances {
	@Then("^Enter valid ([^\"]*)$")
	public void enter_valid_email(String email)  {
		
		loginPage.setUserName(email);
		
	}
	@And("^Entered valid ([^\"]*)$")
	public void enter_valid_pasword(String password) {
		
		loginPage.setPassWord(password);
		
	}
	

	@Then("I am redirected to the home page")
	public void redirected_to_home_page()  {
		homePage.pageVerification();
		
	}

}
