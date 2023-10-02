package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Utilities {

    private WebDriver driver;
    private WebDriverWait wait;

    public Utilities(WebDriver driver) {
        this.driver = driver;
        Duration timeout = Duration.ofSeconds(10); // Adjust the timeout duration as needed.
        wait = new WebDriverWait(this.driver, timeout);
    }

    // Method to click an element after waiting for it to be clickable
    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void enterText(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    // Method to wait for an element to be present on the page
    public void waitForElementToBePresent(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
