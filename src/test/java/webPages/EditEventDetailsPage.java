package webPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class EditEventDetailsPage extends BasePage{

    public EditEventDetailsPage(WebDriver driver, String url) {
        super(driver, url);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="/html/body/div[6]/md-dialog/md-dialog-actions/span[3]/button")
    private WebElement saveImageButton;
    
    @FindBy(xpath="//*[@id=\"ce-file-upload\"]")
     private WebElement eventImage; 
    
    @FindBy(xpath="//*[contains(@name,'createEventForms.create_event_detail_2')]")//*[@id="taTextElement8751179876591206"]
    private WebElement eventDescription;
//id=taTextElement4485572094996581    

    public void clickOnSaveImageButton() {
    	saveImageButton.click();
    }
    
    public void freeEventImageUpload() throws InterruptedException, AWTException {
    	try {
    	wait.until(ExpectedConditions.elementToBeClickable(eventImage));
    	eventImage.click();
    	}
    	catch(org.openqa.selenium.StaleElementReferenceException ex) {
        wait.until(ExpectedConditions.elementToBeClickable(eventImage));
        eventImage.click();	
    	}
    	Thread.sleep(2000);
    	Robot rb = new Robot();
        StringSelection str = new StringSelection("C:\\Users\\admin\\eclipse-workspace\\ThePromoApp\\eventImages\\free.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     
         // press Contol+V for pasting
         rb.keyPress(KeyEvent.VK_CONTROL);
         rb.keyPress(KeyEvent.VK_V);
     
        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
     
        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(1000);
        saveImageButton.click();
        Thread.sleep(1000);
        rb.mouseWheel(25);
    }
    
    public void enterFreeEventDescription() throws AWTException, InterruptedException {
    	Robot rb = new Robot();
    	for(int i =0;i<30;i++) {
    	Thread.sleep(10);
    	rb.keyPress(KeyEvent.VK_TAB);
    	}
    	wait.until(ExpectedConditions.elementToBeClickable(saveImageButton));
    	eventDescription.sendKeys("Free event description for automation testing  freeeeeeeeeee");
    }
    	
}
