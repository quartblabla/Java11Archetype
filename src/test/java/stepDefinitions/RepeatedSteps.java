package stepDefinitions;

import java.nio.file.Path;
import java.awt.AWTException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import driverFactory.DriverManagerFactory;
import driverFactory.DriverType;
import webPages.CreateEventPage;
import webPages.EditEventDetailsPage;
import webPages.HomePage;
import webPages.LoginPage;
import webPages.Yopmail;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RepeatedSteps extends Instances{ 
	 	@Before
	    public void testInit() throws IOException, AWTException  {
	        driver = DriverManagerFactory.getDriverManager(DriverType.CHROME).getDriver();
	        homePage = new HomePage(driver, "https://test.thepromoapp.com/");
	        loginPage = new LoginPage(driver, "https://test.thepromoapp.com/login");
	        createEventPage = new CreateEventPage(driver, "https://test.thepromoapp.com/createevent");
	        editEventDetailsPage = new EditEventDetailsPage(driver, "https://test.thepromoapp.com/eventDetails");
	        yopMailPage = new Yopmail(driver,"https://yopmail.com/en");

	    }
	    @After
	    public void closingBrowser(Scenario scenario) throws IOException {



	    	driver.close();
	    }
	    

	    @AfterStep
	    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

	            final byte[] screenshot = ((TakesScreenshot) driver)
	                    .getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot,"image/png", "name");
	        	
        	
	            driver.close();
	        }       
	        }

	    @Given("Navigate to main page")
	    public void navigate_to_main_page() {
	        homePage.getUrl();
	        //Assert.assertEquals("Log In", homePage.getHomePageLoginButton().getText());
	    }
	    
	    @Given("Navigate to login page")
	    public void navigate_to_login_page()  {
	    	
	    	loginPage.navigateToLoginPage();
	    	
	    }
	    
	    @Given("Navigate to Create event page")
	    public void navigate_to_create_event_page() {
	       createEventPage.getUrl();
	    }
	    
		@When("I press the login button")
		public void i_press_the_login_button() {
			loginPage.clickOnLoginButton();
		}
		@Then("I press Save&Exit button")
		public void press_save_button() {
			createEventPage.clickOnSaveButton();
			//loginPage.clickOnFirstLoginErrorCloseButton();
		}
		@Then("I press Save&Exit button for location")
		public void press_location_save_button() {
			createEventPage.clickOnLocationSaveButton();
		}
//		@Then("Upload event image")
//		public void upload_event_image() throws InterruptedException, AWTException {
//			editEventDetailsPage.clickOnEventImage();
//		}
		@And("I press Save&Exit button for date")
		public void press_date_save_button() {
			createEventPage.clickOnDateSaveButton();
		}
		
}
