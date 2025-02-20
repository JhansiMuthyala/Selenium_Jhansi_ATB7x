package com.thetestingacademy.ex_12102024;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_01 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        Thread.sleep(6000);
        driver.close();

    }
}
