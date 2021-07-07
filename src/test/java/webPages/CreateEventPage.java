package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateEventPage extends BasePage {

    public CreateEventPage(WebDriver driver, String url) {
        super(driver, url);
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "event_name")
    private WebElement eventNameInput;
    
    @FindBy(xpath = "//*[@id=\"create_event_form_1\"]/md-input-container[2]/div[1]/span/button")
    private WebElement eventCategoriesDropdown;
    
    @FindBy(xpath="//*[@id=\"create_event_form_1\"]/md-input-container[2]/div[1]/span/div/div/div[2]")
    private WebElement festivalsCategory;
    
    @FindBy(xpath="/html/body/div[2]/div[1]/footer/div/div/div/div/div[2]/button[2]")
    private WebElement saveExitButton;
    
    @FindBy(css="body > div.ng-scope.layout-column.flex > div.js-create-event.mobile-hide.ng-scope.layout-align-start-stretch.layout-column.flex > footer > div > div > div > div > div.col-lg-8.col-md-8.col-xs-8.col-sm-8.text-right > button")
    private WebElement locationSaveExitButton;
    
    @FindBy(css="body > div.ng-scope.layout-column.flex > div.js-create-event.mobile-hide.ng-scope.layout-align-start-stretch.layout-column.flex > footer > div > div > div > div > div.col-lg-8.col-md-8.col-xs-8.col-sm-8.text-right > button")
    private WebElement dateSaveExitButton;
    
    @FindBy(id="input_317")
    private WebElement locationInput;
    
    public void clickOnEventCategories(){
    	eventCategoriesDropdown.click();
    }    
    public void getUrl() {
        driver.get(url);
    }
    
    public void pageVerification() {
    	wait.until(ExpectedConditions.visibilityOf(eventNameInput));
    }
    
    public void setEventName(String eventName) {
        eventNameInput.clear();
        eventNameInput.sendKeys(eventName);
    }
	public void clickOnFestivalsCategory() {
		festivalsCategory.click();		
	}
	public void clickOnSaveButton() {
		saveExitButton.click();
	}
	public void clickOnLocationSaveButton() {
		locationSaveExitButton.click();	
		}
	public void clickOnDateSaveButton() {
		dateSaveExitButton.click();
	}
	public void inputLocation(String location) {
		//wait.until(ExpectedConditions.visibilityOf(locationInput));
		locationInput.clear();
		locationInput.sendKeys(location);	
	}


}
