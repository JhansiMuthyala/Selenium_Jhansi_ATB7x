package com.thetestingacademy.ex_12102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium_06 {

    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.close();

    }
}
