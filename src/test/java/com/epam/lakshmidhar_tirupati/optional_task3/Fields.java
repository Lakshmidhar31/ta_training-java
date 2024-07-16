package com.epam.lakshmidhar_tirupati.optional_task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fields extends BasePage{
    String noOfInstances;
    String osSelection;
    String provisionalModel;
    String machineType;
    String GPUType;
    String noOfGPUs;
    String localSSD;
    String region;
    String discount;

    protected Fields(WebDriver driver) {
        super(driver);
    }

    public void setNoOfInstances() {
        this.noOfInstances = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[7]/span/span[1]/span[2]")).getText();
    }

    public void setOsSelection() {
        this.osSelection = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[8]/span/span[1]/span[2]")).getText();;
    }

    public void setProvisionalModel() {
        this.provisionalModel = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[9]/span/span[1]/span[2]")).getText();
    }

    public void setMachineType() {
        this.machineType = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[3]/span[2]/span[1]/span[2]")).getText();
    }

    public void setGPUType() {
        this.GPUType = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[4]/span[2]/span[1]/span[2]")).getText();
    }

    public void setNoOfGPUs() {
        this.noOfGPUs = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[4]/span[3]/span[1]/span[2]")).getText();
    }

    public void setLocalSSD() {
        this.localSSD = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[5]/span/span[1]/span[2]")).getText();
    }

    public void setRegion() {
        this.region = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[15]/span/span[1]/span[2]")).getText();
    }

    public void setDiscount() {
        this.discount = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[16]/span/span[1]/span[2]")).getText();
    }

    public String getNoOfInstances() {
        return noOfInstances;
    }

    public String getOsSelection() {
        return osSelection;
    }

    public String getProvisionalModel() {
        return provisionalModel;
    }

    public String getMachineType() {
        return machineType;
    }

    public String getGPUType() {
        return GPUType;
    }

    public String getNoOfGPUs() {
        return noOfGPUs;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getRegion() {
        return region;
    }

    public String getDiscount() {
        return discount;
    }
}
