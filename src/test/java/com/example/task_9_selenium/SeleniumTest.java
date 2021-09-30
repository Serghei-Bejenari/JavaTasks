package com.example.task_9_selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SeleniumTest {

    @BeforeAll
    public static void openPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        Driver.createDriver();
    }

    @AfterAll
    public static void closePage() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }

    @Test
    @DisplayName("Login Object")
    public void loginTestObjTest() {
        WebDriver driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
        LoginPageObj loginPage = new LoginPageObj(driver);
        loginPage.login("BSemail1@gmail.com", "Aa788953654");
        assertThat(loginPage.getUserNameValue().equals("BSName BSLastName"), is(true));
        loginPage.logOut();
    }

    @Test
    @DisplayName("Login Object Factory")
    public void loginTestObjFactoryTest() {
        WebDriver driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
        LoginPageObjFactory loginPage = new LoginPageObjFactory(driver);
        loginPage.login("BSemail1@gmail.com", "Aa788953654");
        assertThat(loginPage.getUserNameValue().equals("BSName BSLastName"), is(true));
    }

    @Test
    @DisplayName("Add to Cart")
    public void addToCartObjFactoryTest() {
        WebDriver driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
        AddToCartObjFactory addToCartObj = new AddToCartObjFactory(driver);
        addToCartObj.addToCart();

        assertThat(addToCartObj.getShoppingCartIsEmpty().equals("Your shopping cart is empty."), is(false));
    }
}