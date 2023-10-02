package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper; 

public class LeaveApprovalPage {

    @FindBy(id = "leaveRecordId")
    private WebElement leaveRecordIdField;

    @FindBy(id = "approveButton")
    private WebElement approveButton;

    public LeaveApprovalPage(WebDriver driver) {
        new Wrapper(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterLeaveRecordId(String leaveRecordId) {
        leaveRecordIdField.sendKeys(leaveRecordId);
    }

    public void clickApproveButton() {
        approveButton.click();
    }
}
