package com.example.task_9_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartObjFactory {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    private WebElement tShirt;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    private WebElement openProduct;

    @FindBy(xpath = "//*[@id=\"color_14\"]")
    private WebElement colour;

    @FindBy(name = "Submit")
    private WebElement addToCardButton;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    private WebElement shoppingCart;

    @FindBy(xpath = "//*[@id=\"product_1_2_0_0\"]/td[2]/p/a")
    private WebElement tShirtShoppingCart;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    private WebElement shoppingCartIsEmpty;

    private WebDriver driver;

    public WebElement getShoppingCartIsEmpty() {
        return shoppingCartIsEmpty;
    }

    public String getShoppingCartIsEmptyText() {
        return shoppingCartIsEmpty.getText();
    }

    public AddToCartObjFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        Wait wait = new Wait(driver);

        wait.click(tShirt);
        wait.click(openProduct);
        wait.click(colour);
        wait.click(addToCardButton);
        wait.click(shoppingCart);

    }
}