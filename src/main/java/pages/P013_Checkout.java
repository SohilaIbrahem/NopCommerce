package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.utlity;

public class P013_Checkout {
    private WebDriver driver;
    Select select;
    public P013_Checkout (WebDriver driver)
    {
        this.driver=driver;
    }
    public JavascriptExecutor javaececut;

    public void scrollToBottom() {
        javaececut.executeScript("scrollBy(0,2500)");
    }

    private final By FName=By.id("id=\"BillingNewAddress_FirstName\"");
    private final By LName = By.id("id=\"BillingNewAddress_LastName\"");
    private final By Email = By.id("id=\"BillingNewAddress_Email\"");
    private final By CountryDropdown = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]");
    private final By City = By.xpath("//*[@id=\"BillingNewAddress_City\"]");

    private final By Address = By.xpath("//*[@id=\"BillingNewAddress_Address1\"]");
    private final By ZipCode = By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]");

    private final By PhoneNumber = By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]");
    private final By ContinueButton = By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");

    private final By ContinueShippingButton = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");

    private final By ContinuePaymentButton = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");

    private final By PaymentInfoButton = By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");

    private final By ConfirmButton = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");

    //TODO:Define Actions
    private final By ConfirmationMessage = By.xpath("//div[@class=\"title\"]");
    public P013_Checkout UserEnterFName(String first) {
        driver.findElement(this.FName).sendKeys(first);
        return this;
    }

    public P013_Checkout UserEnterLName(String last) {
        driver.findElement(this.LName).sendKeys(last);
        return this;
    }

    public P013_Checkout UserEnterEmail(String email) {
        driver.findElement(this.Email).sendKeys(email);
        return this;
    }

    public P013_Checkout UserSelectCountryDropdown() {
        select = new Select(driver.findElement(this.CountryDropdown));
        select.selectByIndex(utlity.generateRandomNumber(1, 50));
        return this;
    }

    public P013_Checkout UserEntertCity(String city) {
        driver.findElement(this.City).sendKeys(city);
        return this;
    }
    public P013_Checkout UserEnterAddress(String address) {
        driver.findElement(this.Address).sendKeys(address);
        return this;
    }

    public P013_Checkout UserEnterZipCode(String code) {
        driver.findElement(this.ZipCode).sendKeys(code);
        return this;
    }
    public P013_Checkout UserEnterPhoneNumber(String number) {
        driver.findElement(this.PhoneNumber).sendKeys(number);
        return this;
    }

    public P013_Checkout UserClickOnContinueButton() {
        driver.findElement(this.ContinueButton).click();
        return this;
    }
    public P013_Checkout UserClickOnShippingButton() {
        driver.findElement(this.ContinueShippingButton).click();
        return this;
    }

    public P013_Checkout UserClickOnContinuePaymentButton() {
        driver.findElement(this.ContinuePaymentButton).click();
        return this;
    }

    public P013_Checkout UserClickOnPaymentInfoButton() {
        driver.findElement(this.PaymentInfoButton).click();
        return this;
    }
    public P013_Checkout getConfirmButton() {
        driver.findElement(this.ConfirmButton).click();
        return this;
    }
    Boolean ConfirmationMessage()
    {
        return driver.findElement(this.ConfirmationMessage).getText().equals("Your order has been successfully processed!");
    }

}
