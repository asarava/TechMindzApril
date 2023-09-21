
package com.wrapper;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testbase.TestBase;

public class Wrapper extends TestBase {
	
			public void selectByVisibleText (String pValue, WebElement pSe1ectElement) {
				Select pselect = new Select(pSe1ectElement) ;
				pselect.selectByVisibleText(pValue) ;
			}
			
			public void selectByIndex (int pIndex, WebElement pSe1ectElement) {
				Select pselect = new Select(pSe1ectElement) ;
				pselect.selectByIndex(pIndex) ;
			}
			
			public void selectByValue (String pValue, WebElement pSe1ectElement) {
				Select pselect = new Select(pSe1ectElement) ;
				pselect.selectByValue(pValue) ;
			}
			
			public void alertAccept() {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}
			
			public void alertDismiss() {
				Alert alert = driver.switchTo().alert();
				alert.dismiss();;
			}
			
			public String alertGetText() {
				Alert alert = driver.switchTo().alert();
				String pValue = alert.getText();
				return pValue;
			}
			
			public void actionDropDown(WebElement pSe1ectElement) {
				
				Actions builder = new Actions(driver);
				Action ActionsNDropDown = builder.moveToElement(pSe1ectElement).build();
				ActionsNDropDown.perform();
			}
			
			public void actionDragNDrop(WebElement pSe1ectElementFrom, WebElement pSelectElementTo) {
				Actions builder = new Actions(driver);
				Action DragNDrop = builder.dragAndDrop(pSe1ectElementFrom, pSelectElementTo).build();
				DragNDrop.perform();
			}
			
			public void actionDragNDropByPixel(WebElement pSe1ectElementFrom, int pValueL, int pValueH) {
				Actions builder = new Actions(driver);
				Action DragAndDrop = builder.dragAndDropBy(pSe1ectElementFrom, pValueL, pValueH).build();
				DragAndDrop.perform();
			}
			
			public void iFrames (WebElement pSelectElementFrame, WebElement pSelectElementText, String pValue) {
				driver.switchTo().frame(pSelectElementFrame);
				driver.switchTo().frame(pSelectElementText);
				pSelectElementText.sendKeys(pValue);
			}
			
			public void scroll (WebElement pSe1ectElement) {
				Actions builder = new Actions(driver);
				Action scrollToElement = builder.scrollToElement(pSe1ectElement).build();
				scrollToElement.perform();
			}
			
			public void scrollJavaScript (WebElement pSe1ectElement) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", pSe1ectElement);
			}
			
			public void waitToBeClickable (WebDriver driver, WebElement pSelectElement) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(pSelectElement));
			}
			
			public void waitToBePresentInElement (WebDriver driver, WebElement pSelectElement) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.textToBePresentInElement(pSelectElement, "Invalid credentials"));
			}
			
			public void waitToBeSelectedElement (WebDriver driver, WebElement pSelectElement) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeSelected(pSelectElement));
			}
			
			public void waitToAlertIsPresent (WebDriver driver) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.alertIsPresent());
			}
			
			
			
			/*
			 * // Waits // 
			 * 
			 * 1. Implicit Wait driver.manage().timeouts().implicitlyWait(10,
			 * TimeUnit.SECONDS); driver.manage().timeouts().pageLoadTimeout(7,
			 * TimeUnit.SECONDS);
			 * 
			 * 
			 * // 2. Explicit Wait
			 * 
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 * wait.until(ExpectedConditions.elementToBeClickable(null));
			 * 
			 * // 3. Fluent Wait // @SuppressWarnings({ "rawtypes", "unchecked" })
			 * 
			 * Wait fWait = new
			 * FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.
			 * ofSeconds(1)).ignoring(NoSuchElementException.class);
			 * 
			 * @SuppressWarnings("unchecked") WebElement pDragBoxFromEle = (WebElement)
			 * fWait.until(new Function<WebDriver, WebElement>() {
			 * 
			 * public WebElement apply(WebDriver driver) {
			 * 
			 * return driver.findElement(By.id("draggable")); } });
			 */
			
			
			
}
