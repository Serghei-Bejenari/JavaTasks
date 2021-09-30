package com.example.task_10_BDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        Driver.createDriver();
        if (driver == null) driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}