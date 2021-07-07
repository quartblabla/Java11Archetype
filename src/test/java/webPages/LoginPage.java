package webPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, String url) {
        super(driver, url);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "userName")
    private WebElement userNameInput;

    @FindBy(name = "password")
    private WebElement passWord;

    @FindBy(css = "#login_form > div:nth-child(4) > button")
    private WebElement loginButton;

    @FindBy(xpath="//div[3]/div/button")
    private WebElement loginErrorClose;
    
    @FindBy(xpath="//div[3]/div[2]/button")
    private WebElement loginErrorClose1;
    
    @FindBy(xpath="/html/body/div[3]/div/div[2]/div[3]/a")
    private WebElement signUpLink;
    
    @FindBy(name="signUpValue")
    private WebElement signUpValue;
    
    @FindBy(xpath = "//*[@id=\"signupFormId\"]/div/button")
    private WebElement verifyEmailButton;
    
    @FindBy(xpath="//*[@id=\"OTP_verify_form\"]/div/button")
    private WebElement doneButton;
    
    public void waitLoginPageOpened() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
       // driver.wait(500);
    }


    public void navigateToLoginPage() {
        driver.get(url);
    }

    public void setUserName(String userName) {
        wait.until(ExpectedConditions.visibilityOf(userNameInput));
        userNameInput.clear();
        userNameInput.sendKeys(userName);
    }

    public void setPassWord(String password) {
        passWord.clear();
        passWord.sendKeys(password);
    }
    
    
    public void setNotExistingSignUpValue() {
	
	        int length = 10;
	        boolean useLetters = true;
	        boolean useNumbers = true;
	        String yopmail="@yopmail.com";
	        String randomName = RandomStringUtils.random(length, useLetters, useNumbers);
	        String notExistingEmail= randomName+yopmail;


	        System.out.println(notExistingEmail);
	        System.out.println(notExistingEmail);
	        System.out.println(notExistingEmail);
	        System.out.println(notExistingEmail);
	    
    	wait.until(ExpectedConditions.visibilityOf(signUpValue));
    	signUpValue.sendKeys(notExistingEmail);
    }

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void clickOnFirstLoginErrorCloseButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginErrorClose)).click();
    }
    public void clickOnSecondLoginErrorCloseButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginErrorClose1)).click();
    }
    
    public void clickOnSignUpLink() {
    	wait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
    }
    
    public void clickOnVerifyEmailButton() {
     wait.until(ExpectedConditions.elementToBeClickable(verifyEmailButton)).click();
    }
    
    public void tabSwitching() throws AWTException {
//    	String signUpTab=driver.getWindowHandle();
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL); 
    	r.keyPress(KeyEvent.VK_T); 
    	r.keyRelease(KeyEvent.VK_CONTROL); 
    	r.keyRelease(KeyEvent.VK_T);
//    	r.keyPress(KeyEvent.VK_CONTROL); 
//    	r.keyPress(KeyEvent.VK_TAB); 
//    	r.keyPress(KeyEvent.VK_CONTROL); 
//    	r.keyPress(KeyEvent.VK_TAB);

//    	String yopMailTab=driver.getWindowHandle();
//    	driver.switchTo().window(yopMailTab);
//    	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
//    	driver.get("https://yopmail.com/en/");
    	
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	System.out.println(tabs.size());
    	driver.switchTo().window(tabs.get(1));   	
    	driver.get("https://yopmail.com/en/");
    	
    	//driver.switchTo().window(yopMailTab);
    	
//    	driver.get("https://yopmail.com/en/");
    	
    //	String originalWindow = driver.getWindowHandle();

    	//Check we don't have other windows open already
   // 	assert driver.getWindowHandles().size() == 1;

    	//Click the link which opens in a new window
 //   	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
//    	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//    	driver.findElement(By.linkText("https://yopmail.com/en/")).sendKeys(selectLinkOpeninNewTab);
	//Wait for the new window or tab
        //wait.until(numberOfWindowsToBe(2));

    	//Loop through until we find a new window handle
//    	for (String windowHandle : driver.getWindowHandles()) {
//    	    if(!originalWindow.contentEquals(windowHandle)) {
//    	        driver.switchTo().window(windowHandle);
//    	        break;
//    	    }
//    	}

    	//Wait for the new tab to finish loading content
//    	wait.until(titleIs("Selenium documentation"));
//    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

//    	String yopMailTab=driver.getWindowHandle();
////    	ArrayList<String> tabs = new ArrayList<String>();
////    	tabs.add(0,signUpTab);
////    	tabs.add(1,yopMailTab);
//    	driver.switchTo().window(yopMailTab);
//    	driver.get("https://yopmail.com/en/");
//    	tabs.add(signUpTab);
//    	tabs.add(yopMailTab);
    
//////        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(yopMailTab);

    }

    }
