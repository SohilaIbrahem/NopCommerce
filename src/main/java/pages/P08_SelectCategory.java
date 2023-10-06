package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class P08_SelectCategory {

    private WebDriver driver;
    Actions action;
    Select select;
    public P08_SelectCategory(WebDriver driver)
    {
        this.driver=driver;
        this.action = new Actions(driver);
    }
    private final By headerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    private final By selectItemFromDropdown =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']");


    public P08_SelectCategory UserHeaderMenu(WebDriver driver) {
        this.driver=driver;
        this.action = new Actions(driver);
        return this;
    }

    public P08_SelectCategory UserSelectItemFromDropdown() {
        driver.findElement(this.selectItemFromDropdown).click();
        return this;
    }


}
