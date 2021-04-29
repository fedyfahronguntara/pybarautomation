package Page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseSetup.Setup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainAction extends Setup {
	public void input(AndroidElement element,String value) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public void click(AndroidElement button) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(button));
		button.click();
	}
//	
	public void getassert(String actual,AndroidElement element) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.getText().contains(actual));
	}
	
	public void verifyEl(AndroidElement element) {
		try {
			(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
		}catch (NoSuchElementException e) {
			Assert.fail("Element "+element+" is not found or element not use accessibility Id");
		}
		Assert.assertTrue(element.isDisplayed(), element+" wasn't found");
	}
	
	public void scrollAndClick(String visibleText) {
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
	        
	    }
	public void scroll(String visibleText) {
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
	        
	    }
	
	public void wait1(AndroidElement element) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
	}
	
	public void wait_text(AndroidElement element, String text) {
		(new WebDriverWait(driver,60)).until(ExpectedConditions.textToBePresentInElement(element,text));
	}
	
	public void waitspecifictext(AndroidElement element, String value) {
		String actualString = element.getText();
		assertTrue(actualString.contains(value));
	}
}
