package com.thetestingacademy.ex_12102024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class selenium_03 {
    @Test
    public void test_001(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }

}
