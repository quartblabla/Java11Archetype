package webPages;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	 	protected WebDriver driver;
	    protected WebDriverWait wait;
	    protected String url;
	    

	    public BasePage(WebDriver driver, String url) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, 10);
	        this.url = url;
	    }

	    public void takeScreenShoot() throws IOException {
	        File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //FileUtils.copyFile(scrFile, new File("./"+ LocalDateTime.now() +".png"));
	        FileUtils.copyFile(scrFile, new File("./screenShoots/image99.png"));

	    }
	    

	    public void close(){
	        driver.quit();
	    }
}
