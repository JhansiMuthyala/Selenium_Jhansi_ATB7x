package com.thetestingacademy.ex_12102024.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium_12 {

    @Test

     public void VerifyVWOPageTitle(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
      //  driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();

    }

}
