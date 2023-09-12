package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_LoginPage {

    private WebDriver driver;
    public P02_LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }


   //TODO:
    private final By email = By.id("Email");
    private final By pass = By.id("Password");
    ////button[normalize-space()='Log in']
    private final By loginBtn = By.xpath("//button[text()='Log in']");

    private  final By errorMesage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    private final By logOutButton =By.xpath("//a[@class=\"ico-logout\"]");


    //TODO:
    public P02_LoginPage addUseremail(String Email) {
        driver.findElement(this.email).sendKeys(Email);
        return this;
    }

    public P02_LoginPage addUserPasswod(String Password) {
        driver.findElement(this.pass).sendKeys(Password);
        return this;
    }

    public P02_LoginPage UserClickLogin() {
        driver.findElement(this.loginBtn).click();
        return this;
    }
    public boolean checkErrorMessage(){
        return driver.findElement(errorMesage).getText().equals("Login was unsuccessful. Please correct the errors and try again.");
    }
    public boolean checkLogoutButton(){
        return driver.findElement(logOutButton).isDisplayed();
    }
}























    //TODO:
/*
    public  void enterEmail(String EMAIL)
    {
        WebElement element = driver.findElement(email);
        element.sendKeys(EMAIL);
    }

    public void enterPass(String PASSWORD)
    {
        WebElement element = driver.findElement(pass);
        element.sendKeys(PASSWORD);
    }

    public void clickLoginBtn()
    {
        WebElement element = driver.findElement(loginBtn);
        element.click();
    }




*/



