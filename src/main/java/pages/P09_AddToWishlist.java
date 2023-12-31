package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class P09_AddToWishlist {

    public JavascriptExecutor javaececut ;

    private WebDriver driver;
    public P09_AddToWishlist(WebDriver driver)
    {

        this.driver=driver;
    }


    private By electronic = By.xpath("//a[@title='Show products in category Electronics'][normalize-space()='Electronics']");
    private  By camera = By.xpath("//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo']");
    private  By nikonCam = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nikon D5500 DSLR')]");
    private By addBtn = By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]");
    private By ConfirmationMessage = By.xpath("//div[@class=\"bar-notification success\"]");
    private By prductComparison = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
    private By addCamToCart =By.id("add-to-cart-button-14");
    private By addToCompare = By.xpath("//button[normalize-space()='Add to compare list']");

    public void scrollToBottom()

    {
        javaececut.executeScript("scrollBy(0,2500)");
    }

    public P09_AddToWishlist SelectElectronic() {
        driver.findElement(this.electronic).click();
        return this;
    }

    public P09_AddToWishlist SelectCamera() {
        driver.findElement(this.camera).click();
        return this;
    }

    public P09_AddToWishlist selectNikonCam() {
        driver.findElement(this.nikonCam).click();
        return this;
    }

    public P09_AddToWishlist ClickOnAddBtn() {
        driver.findElement(this.addBtn).click();
        return this;
    }
    public P09_AddToWishlist UserClickOnPrductComparison() {
        driver.findElement(this.prductComparison).click();
        return this;
    }


    public P09_AddToWishlist ClickOnAddCamToCart() {
        driver.findElement(this.addCamToCart).click();
        return this;
    }

    public P09_AddToWishlist ClickOnAddToCompare() {
        driver.findElement(this.addToCompare).click();
        return this;
    }
    public Boolean ConfirmationMessageIsDiplayed()
    {
        return driver.findElement(this.ConfirmationMessage).isDisplayed();
    }
}
