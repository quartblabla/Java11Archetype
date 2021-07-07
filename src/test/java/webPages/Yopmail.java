package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Yopmail extends BasePage {
	
	    public Yopmail(WebDriver driver, String url) {
	        super(driver, url);
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(css="#ycptcpt")
	    private WebElement emailTextfield;
	    
	    public void navigateToYopMail(){
	    	driver.get("https://yopmail.com/en/");
	    }
	    
	    public void setYopEmail()  {
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(emailTextfield));	    	
	    	emailTextfield.sendKeys("qqqqq");
//	    	driver.wait(100000);
	    }
}
