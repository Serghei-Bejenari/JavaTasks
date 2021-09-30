package com.example.task_9_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObj {
    private WebDriver driver;

    private By accountButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private By emailField = By.name("email");
    private By passwordField = By.id("passwd");
    private By loginButton = By.name("SubmitLogin");
    private By userName = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
    private By logOut = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");

    public LoginPageObj(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(accountButton).click();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();

    }

    public void logOut() {
        driver.findElement(logOut).click();
    }

    public WebElement getUserName() {
        return driver.findElement(userName);
    }

    public String getUserNameValue() {
        return driver.findElement(userName).getText();
    }
}