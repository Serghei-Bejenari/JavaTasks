package com.example.task_10_BDD;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void closePage() throws InterruptedException {
        Thread.sleep(5000);
        Driver.createDriver().quit();
    }
}