package com.epam.lakshmidhar_tirupati.optional_task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SummaryPagePopUp extends BasePage{

    @FindBy(linkText = "Open estimate summary")
    private WebElement openEstimateSummary;

    protected SummaryPagePopUp(WebDriver driver) {
        super(driver);
    }

    public EstimatedSummary openEstimateSummaryMethod() throws InterruptedException {
        WebElement summaryElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(this.openEstimateSummary));
        summaryElement.click();
        return new EstimatedSummary(driver);
    }

}
