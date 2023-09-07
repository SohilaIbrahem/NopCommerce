package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.EMAIL;

public class P03_ForgetPassword {

    private WebDriver driver;

    public P03_ForgetPassword(WebDriver driver)
    {

        this.driver=driver;
    }


    private By loginBtn = By.xpath("//a[@class='ico-login']");

    private By forgetPass = By.xpath("//a[normalize-space()='Forgot password?']");


    private By email = By.xpath("//input[@id='Email']");



    private By recoverBtn =By.xpath("//button[@name='send-email']");

    public P03_ForgetPassword selectLoginBtn() {
        driver.findElement(this.loginBtn).click();
        return this;
    }
    public P03_ForgetPassword clickForgetPass() {
        driver.findElement(this.forgetPass).click();
        return this;
    }

    public P03_ForgetPassword sendEmail(String EMAIL) {
        driver.findElement(this.email).sendKeys(EMAIL);
        return this;
    }

    public P03_ForgetPassword UserClickRecoverBtn() {
        driver.findElement(this.recoverBtn).click();
        return this;
    }












}
