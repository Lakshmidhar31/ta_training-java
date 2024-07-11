package com.epam.lakshmidhar_tirupati.optional_task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {

    private WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
    }

    @Test
    public void Task1Test(){
        driver.get("https://pastebin.com/");
        driver.findElement(By.id("postform-text")).sendKeys("Hello from WebDriver");
        driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        driver.findElement(By.xpath("//*[@id=\"postform-name\"]")).sendKeys("helloweb");
        driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[10]/button")).click();
        driver.close();
    }
}
