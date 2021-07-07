package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, String url) {
        super(driver, url);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[1]/div/div/md-toolbar[1]/div/div[5]/a")
    private WebElement homePageLoginButton;
                   
    @FindBy(linkText = "Create Event")
    private WebElement createEventButton;

    @FindBy(linkText = "Search")
    private WebElement searchButton;

    @FindBy(id = "modal-title")
    private WebElement loginModalTitle;

    @FindBy(css = "/html/body/div[2]/div/div[1]/div/div[1]/div/div/md-toolbar[1]/div/div[2]/a")
    private WebElement BrowseEvent;
    public void pageVerification() {
    	wait.until(ExpectedConditions.elementToBeClickable(createEventButton));
    }

    public void clickOnCreateEventButton() {

        wait.until(ExpectedConditions.elementToBeClickable(createEventButton)).click();
    }
    public void clickOnhomePageLoginButton(){
        homePageLoginButton.click();
    }
    public void getUrl() {

        driver.get(url);
        wait.until(ExpectedConditions.elementToBeClickable(homePageLoginButton));
    }

    public WebElement getHomePageLoginButton() {
        return homePageLoginButton;
    }

    public WebElement getCreateEventButton() {
        return createEventButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getLoginModalTitle() {
        return loginModalTitle;
    }

    public WebElement getBrowseEvent() {
        return BrowseEvent;
    }
}
