package com.example.task_9_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;

    public static WebDriver createDriver() {
        if (driver == null) driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver = null;
    }
}