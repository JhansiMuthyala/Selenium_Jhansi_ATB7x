package com.thetestingacademy.ex_12102024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class selenium_09
{

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("src/test/resources/adblock.crx"));

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://sdet.live");

    }



}
