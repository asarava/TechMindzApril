package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper; 

public class PasswordResetPage extends TestBase {

    @FindBy(id = "resetPasswordUsername")
    private WebElement usernameInput;

    @FindBy(id = "resetPasswordNewPassword")
    private WebElement newPasswordInput;

    @FindBy(id = "resetPasswordConfirmPassword")
    private WebElement confirmPasswordInput;

    @FindBy(id = "btnResetPassword")
    private WebElement resetPasswordButton;

    public PasswordResetPage() {
        PageFactory.initElements(driver, this);
        new Wrapper(driver); 
    }

    public void resetPassword(String username, String newPassword, String confirmPassword) {
        usernameInput.sendKeys(username);
        newPasswordInput.sendKeys(newPassword);
        confirmPasswordInput.sendKeys(confirmPassword);
        resetPasswordButton.click();
    }
}








