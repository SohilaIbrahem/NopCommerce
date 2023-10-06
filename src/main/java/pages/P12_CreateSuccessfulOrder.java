package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class P12_CreateSuccessfulOrder {
    private WebDriver driver;

    public P12_CreateSuccessfulOrder(WebDriver driver) {
        this.driver = driver;
    }

    public JavascriptExecutor javaececut;

    public void scrollToBottom() {
        javaececut.executeScript("scrollBy(0,2500)");
    }
    private final By Books = By.xpath("(//a[text()=\"Books \"])[1]");
    private final By ChooseBook =By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]");
    private final By Jewelry =By.xpath("(//a[text()=\"Jewelry \"])[1]");
    private final By ChooseJewelry = By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]");
    private final By ClickOnShoppingCart = By.xpath("//a[text()=\"shopping cart\"]");
    private final By AgreeRadioButton = By.xpath("//input[@id=\"termsofservice\"]");
    private final By CheckoutButton = By.xpath("//button[@id=\"checkout\"]");



    public P12_CreateSuccessfulOrder UserClickOnBooks() {
        driver.findElement(this.Books).click();
        return this;
    }

    public P12_CreateSuccessfulOrder UserChooseBook() {
        driver.findElement(this.ChooseBook).click();
        return this;
    }

    public P12_CreateSuccessfulOrder UserClickOnJewelry() {
        driver.findElement(this.Jewelry).click();
        return this;
    }

    public P12_CreateSuccessfulOrder UserChooseJewelry() {
        driver.findElement(this.ChooseJewelry).click();
        return this;
    }

    public P12_CreateSuccessfulOrder UserClickOnShoppingCart() {
        driver.findElement(this.ClickOnShoppingCart).click();
        return this;
    }

    public P12_CreateSuccessfulOrder UserClickOnAgreeRadioButton() {
        driver.findElement(this.AgreeRadioButton).click();
        return this;
    }

    public P12_CreateSuccessfulOrder UserClickOnCheckoutButton() {
        driver.findElement(this.CheckoutButton).click();
        return this;
    }





}
