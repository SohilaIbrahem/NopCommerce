package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class P00_HomePageHoverMenu {

    private WebDriver driver;
    Actions action;
    Select select;
    public P00_HomePageHoverMenu(WebDriver driver)
    {
        this.driver=driver;
        this.action = new Actions(driver);
    }



  //TODO:Header menu
    private final By computersLink = By.linkText("Computers");
    private final By softwareFromComp = By.cssSelector("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']");
    private final By electronicsLink = By.linkText("Electronics");
    private final By apparelLink = By.linkText("Apparel");
    private final By digitalDownloadsLink = By.linkText("Digital downloads");
    private final By booksLink = By.linkText("Books");
    private final By jewelryLink = By.linkText("Jewelry");
    private final By giftCardsLink = By.linkText("Gift Cards");



    public P00_HomePageHoverMenu clickOnComputersLink() {
        WebElement computersLinkElement = driver.findElement(computersLink);
        action.moveToElement(computersLinkElement).perform();
        driver.findElement(softwareFromComp).click();
        //driver.findElement(this.computersLink).click();
       // action = new Actions(driver.findElement(this.computersLink));
        //action = new Actions(driver).moveToElement(this.computersLink).click().perform();
        return this;
    }
   /* public P00_HomePageHoverMenu selectSoftwareFromComp() {
        WebElement electronicsLink = driver.findElement(electronicsLink);
        action.moveToElement(electronicsLink).perform();
        driver.findElement(this.softwareFromComp).click();
        return this;
    }
*/
    public P00_HomePageHoverMenu clickOnElectronicsLink() {
        WebElement electLink = driver.findElement(electronicsLink);
        action.moveToElement(electLink).perform();
        driver.findElement(jewelryLink).click();
        return this;
    }

    public P00_HomePageHoverMenu clickOnApparelLink() {


        return this;
    }

    public P00_HomePageHoverMenu clickOnDigitalDownloadsLink() {


        return this;
    }

    public P00_HomePageHoverMenu clickOnBooksLink() {

        return this;
    }

    public P00_HomePageHoverMenu clickOnJewelryLink() {


        return this;
    }

    public P00_HomePageHoverMenu clickOnGiftCardsLink() {


        return this;
    }





}
