package com.thetestingacademy.ex_12102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_13 {

    @Test
    public void VerifyVWOPageTitleinChrome(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--Start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");



    }



}
