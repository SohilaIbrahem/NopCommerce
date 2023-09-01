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

    private By recoverBtn = By.xpath("//a[normalize-space()='Forgot password?']");


    private By email = By.xpath("//input[@id='Email']");


    public P03_ForgetPassword selectLoginBtn() {
        driver.findElement(this.loginBtn).click();
        return this;
    }



    private By clickForget = By.xpath("//a[normalize-space()='Forgot password?']");

    public P03_ForgetPassword  ClickForget() {
        driver.findElement(this.clickForget).click();
        return this;
    }

    public P03_ForgetPassword sendEmail(String EMAIL) {
        driver.findElement(this.email).sendKeys(EMAIL);
        return this;
    }


    public P03_ForgetPassword clickForgetBtn() {
        driver.findElement(this.recoverBtn).click();
        return this;
    }





}
