package com.wrapper;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class Wrapper extends TestBase {
	
	//select by visible text
	public void selectByVisibleText(String pValue, WebElement pSelectElement) {
		Select pSelect=new Select(pSelectElement);
		pSelect.selectByVisibleText(pValue);
	}
	
	//select by index
	public void selectByIndex(int pIndex, WebElement pSelectElement) {
		Select pSelect=new Select(pSelectElement);
		pSelect.selectByIndex(pIndex);
	}
	
	//select by value
	public void selectByValue(String pValue, WebElement pSelectElement) {
		Select pSelect=new Select(pSelectElement);
		pSelect.selectByValue(pValue);
	}
	
	//alert accept
	public void alertAccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	//alert dismiss
	public void alertDismiss() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	//alert text
	public String alertGetText() {
		Alert alert=driver.switchTo().alert();
		String pValue=alert.getText();
		return pValue;
	}
	
	//mouse over to view dropdown
	public void mouseOverToViewDropdown(WebElement pMoveToElement) {
		Actions builder=new Actions(driver);  
		Action moveToElement=builder.moveToElement(pMoveToElement).build();
		moveToElement.perform();
	}
	
	//scroll
	public void scrollOver(WebElement pInteractions) {	
		Actions builder=new Actions(driver);
		Action scrollToElement=builder.scrollToElement(pInteractions).build();
		scrollToElement.perform();
	    //JavascriptExecutor js=(JavascriptExecutor) driver;  //use JavascriptExecutor if scrollToElement.perform() doesn't work
	    //js.executeScript("arguments[0].scrollIntoView();",pInteractions);
	}
	
	//Drag and drop
	public void dragAndDrop(WebElement pDragBoxFrom,WebElement pDragBoxTo) {
		Actions builder=new Actions(driver);
		Action dragAndDrop=builder.dragAndDrop(pDragBoxFrom, pDragBoxTo).build(); //most recommended method
		//Action dragAndDrop=builder.dragAndDropBy(pDragBoxFrom, 100,100).build();  //offset method
		dragAndDrop.perform();
	}
	
	//multiple tabs/window handling
	public void multipleWindows(WebElement pOpenNew) throws InterruptedException {
		pOpenNew.click();
		pOpenNew.click();
		pOpenNew.click();
		pOpenNew.click();
		pOpenNew.click();
		
		//To get the current window handle
		String currentWindow=driver.getWindowHandle();
		
		//To get all window handles
		Set<String> allWindows=driver.getWindowHandles(); //we use set here to get all unique tabs
		
		for(String temp:allWindows) {
			driver.switchTo().window(temp);
			Thread.sleep(5000);       //not necessary
		}
		
		driver.switchTo().window(currentWindow);  //to get initial tab
	}
	
	//iFrames
	public void iFrames(WebElement frameElement,WebElement textInFrame) {
		driver.switchTo().frame(frameElement);
		textInFrame.sendKeys("Test");
	}
	
	//Explicit Wait
	public void webDriverWaitToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
    // Explicit Wait for User Role options to appear in a dropdown
    public void waitForUserRoleOptionsToAppear(WebElement dropdown) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));
    }
    
    public void waitForElementToBeClickableByCssSelector(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = driver.findElement(By.cssSelector(cssSelector));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

 
}
