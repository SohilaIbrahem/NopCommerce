package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.utlity;

public class P06_CurrencyPage {


 Select select;
    private WebDriver driver;

    public P06_CurrencyPage(WebDriver driver)
    {

        this.driver=driver;
    }


    private By currencyDropdwn = By.id("customerCurrency");

    public P06_CurrencyPage SelectCurrencyDropdwn() {
        select = new Select(driver.findElement(this.currencyDropdwn));
        select.selectByIndex(utlity.generateRandomNumber(1,2));

        return this;
    }



}
