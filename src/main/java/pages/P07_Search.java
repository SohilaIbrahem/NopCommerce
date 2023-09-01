package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utlity;

public class P07_Search {

    private WebDriver driver;
    public P07_Search(WebDriver driver)
    {
        this.driver=driver;
    }


    private  final By searchField = By.xpath("//input[@id=\"small-searchterms\"]");

    private  final By searchButton = By.xpath("//button[@type=\"submit\"]");

    private final By itemsList =By.id("ui-id-1");


    public P07_Search SearchField(String item) {
        //driver.findElement(utlity.selectRandomMenuItem());
        driver.findElement(this.searchField).sendKeys(item);
        return this;
    }

    public P07_Search clickSearchButton() {
        driver.findElement(this.searchButton).click();
        return this;
    }

    public P07_Search  selectFromItemsList(String list) {
        driver.findElement(this.itemsList).sendKeys(list);
        return this;
    }





}
