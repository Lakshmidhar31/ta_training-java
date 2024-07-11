package com.epam.lakshmidhar_tirupati.optional_task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task1 {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new EdgeDriver();
    }

    @AfterClass
    public void afterClass(){
        driver.close();
        driver.quit();
    }


    @Test
    public void Task1Test(){
        driver.get("https://pastebin.com/");

        WebElement pasteContent = driver.findElement(By.id("postform-text"));
        pasteContent.sendKeys("Hello from WebDriver");

        WebElement DropDownOfTime = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]"));
        DropDownOfTime.click();

        WebElement expirationTime = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        expirationTime.click();

        WebElement pageTitle = driver.findElement(By.xpath("//*[@id=\"postform-name\"]"));
        pageTitle.sendKeys("helloweb");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[10]/button"));
        submit.click();
    }
}
