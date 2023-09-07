package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

     private WebDriver driver;
     public PageBase(WebDriver driver)
     {
         this.driver=driver;
     }


    private final By  ClickOnRegister = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");

    private final By ClickOnLogin = By.xpath("//a[@class='ico-login']");

    private final By ClickCurrencyDropdown =By.id("customerCurrency");



    private final By ClickOnChangePassword = By.xpath("//a[@class='ico-account']");


    public PageBase UserClickOnRegister() {
        driver.findElement(this.ClickOnRegister).click();
        return this;
    }
    public PageBase UserClickOnLogin() {
        driver.findElement(this.ClickOnLogin).click();
        return this;
    }

    public PageBase UerClickCurrencyDropdown() {
        driver.findElement(this.ClickCurrencyDropdown).click();
        return this;
    }

    public PageBase UserClickOnChangePassword() {
        driver.findElement(this.ClickOnChangePassword).click();
        return this;
    }

}
