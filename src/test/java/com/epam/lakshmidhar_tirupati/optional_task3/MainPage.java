package com.epam.lakshmidhar_tirupati.optional_task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()='Add to estimate'][@class='UywwFc-vQzf8d']")
    private WebElement addToEstimate;

    @FindBy(xpath = "//h2[@class='honxjf'][text()='Compute Engine']")
    private WebElement computeEngine;

    @FindBy(id = "c13")
    private WebElement noOfInstances;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[7]/div/div[1]/div/div/div/div[1]/div")
    private WebElement operatingSystem;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[7]/div/div[1]/div/div/div/div[2]/ul/li[1]")
    private WebElement osSelection;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[9]/div/div/div[2]/div/div/div[1]/label")
    private WebElement provisioningModel;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div")
    private WebElement machineFamilyDropDown;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[1]/div/div/div/div[2]/ul/li[1]")
    private WebElement machineFamily;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div")
    private WebElement seriesDropDown;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]")
    private WebElement series;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[1]/div")
    private WebElement machineTypeDropDown;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/ul/li[7]")
    private WebElement machineType;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[21]/div/div/div[1]/div/div/span/div/button/div/span[1]")
    private WebElement addGPU;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div/div[1]/div/div/div/div[1]/div")
    private WebElement gpuModelDropDown;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div/div[1]/div/div/div/div[2]/ul/li[3]")
    private WebElement gpuModel;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[24]/div/div[1]/div/div/div/div[1]/div")
    private WebElement noOfGPUsDropDown;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[24]/div/div[1]/div/div/div/div[2]/ul/li[1]")
    private WebElement noOfGPUs;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[27]/div/div[1]/div/div/div/div[1]/div")
    private WebElement localSSDDropDown;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[27]/div/div[1]/div/div/div/div[2]/ul/li[3]")
    private WebElement localSSD;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[29]/div/div[1]/div/div/div/div[1]/div")
    private WebElement regionDropDown;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[29]/div/div[1]/div/div/div/div[2]/ul/li[7]")
    private WebElement region;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[31]/div/div/div[2]/div/div/div[2]/label")
    private WebElement discount;

    @FindBy(xpath = "//*[@id=\"ow4\"]/div/div/div/div/div/div/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/button/span[6]")
    private WebElement shareButton;

    protected MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open(){
        driver.get("https://cloud.google.com/products/calculator");
        return this;
    }

    public SummaryPagePopUp formFill() throws InterruptedException {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.addToEstimate)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.computeEngine)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.noOfInstances)).clear();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.noOfInstances)).sendKeys("4");
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.operatingSystem)).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.osSelection)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.provisioningModel)).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.machineFamilyDropDown)).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.machineFamily)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.seriesDropDown)).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.series)).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.machineTypeDropDown)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.machineType)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.addGPU)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.gpuModelDropDown)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.gpuModel)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.noOfGPUsDropDown)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.noOfGPUs)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.localSSDDropDown)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.localSSD)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.regionDropDown)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.region)).click();
//        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.discount)).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.shareButton)).click();
        Thread.sleep(2000);

        return new SummaryPagePopUp(driver);
    }
}
