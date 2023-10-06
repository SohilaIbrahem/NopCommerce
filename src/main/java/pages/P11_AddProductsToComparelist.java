package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_AddProductsToComparelist  {
    private WebDriver driver ;
    public P11_AddProductsToComparelist(WebDriver driver)
    {
        this.driver=driver;
    }
    //TODO:define locators
    private final By booksFromMenue =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");

    private final By item_1 = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[2]");
    private final By item_2 = By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[2]");

   private final By cofMessage =By.xpath("//p[@class='content']");

    public P11_AddProductsToComparelist UserSelectBooksFromMenue() {
        driver.findElement(this.booksFromMenue).click();
        return this;
    }

    public P11_AddProductsToComparelist UserAddItem_1() {
        driver.findElement(this.item_1).click();
        return this;
    }

    public P11_AddProductsToComparelist UserAddItem_2() {
        driver.findElement(this.item_2).click();
        return this;
    }

    public boolean CheckConfirmationMessage()
    {
        return driver.findElement(this.cofMessage).isDisplayed() ;
    }



}
