package com.epam.lakshmidhar_tirupati.optional_task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2 {

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
    public void Task2Test() throws InterruptedException {
        driver.get("https://pastebin.com/");
//        driver.findElement(By.xpath("//span[text()='paste']")).click();
        WebElement newPaste = driver.findElement(By.id("postform-text"));
        newPaste.sendKeys("git config --global user.name  \\\"New Sheriff in Town\\\"\\n\" +\n" +
                "\"git reset $(git commit-tree HEAD^{tree} -m \\\"Legacy code\\\")\\n\" +\n" +
                "\"git push origin master --force");

        WebElement dropDownOfBash = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[3]/div/span/span[1]/span/span[2]"));
        dropDownOfBash.click();

        WebElement selectBash = driver.findElement(By.xpath("//li[text()='Bash']"));
        selectBash.click();

        WebElement dropDownTime = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]"));
        dropDownTime.click();

        WebElement expirationTime = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        expirationTime.click();

        WebElement pageTitle = driver.findElement(By.xpath("//*[@id=\"postform-name\"]"));
        pageTitle.sendKeys("how to gain dominance among developers");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[10]/button"));
        submit.click();
    }

    @Test
    public void testTitle(){
        String title = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("how to gain dominance among developers", title,
                "The Paste Title should be 'how to gain dominance among developers'");
    }

    @Test
    public void testSyntaxType(){
        String syntax = driver.findElement(By.xpath("//a[text()='Bash']")).getText();
        Assert.assertEquals("Bash", syntax,
                "The Syntax Highlighting should be 'Bash'");
    }

    @Test
    public void testPasteElement(){
        String content = driver.findElement(By.xpath("//ol[li]")).getText();
        Assert.assertEquals("git config --global user.name  \\\"New Sheriff in Town\\\"\\n\" +\n" +
                "\"git reset $(git commit-tree HEAD^{tree} -m \\\"Legacy code\\\")\\n\" +\n" +
                "\"git push origin master --force", content);
    }
}