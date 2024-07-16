package com.epam.lakshmidhar_tirupati.optional_task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task3 {

    private WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver(){
        driver.close();
        driver.quit();
    }

    @Test
    public void task3Test() throws InterruptedException {
        MainPage main = new MainPage(driver);
        main.open();
        SummaryPagePopUp summary = main.formFill();
        EstimatedSummary estimatedSummary = summary.openEstimateSummaryMethod();
        Fields fields = estimatedSummary.getSummaryText();

        Assert.assertEquals(fields.getNoOfInstances(), "4");
        Assert.assertEquals(fields.getOsSelection(), "Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)");
        Assert.assertEquals(fields.getProvisionalModel(), "Regular");
        Assert.assertEquals(fields.getMachineType(), "n1-standard-8, vCPUs: 8, RAM: 30 GB");
        Assert.assertEquals(fields.getGPUType(), "NVIDIA TESLA P4");
        Assert.assertEquals(fields.getNoOfGPUs(), "1");
        Assert.assertEquals(fields.getLocalSSD(), "2x375 GB");
        Assert.assertEquals(fields.getRegion(), "Netherlands (europe-west4)");
        Assert.assertEquals(fields.getDiscount(), "1 year");
    }

}