package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_changePassworg {


    private WebDriver driver;

    public P06_changePassworg(WebDriver driver)
    {
        this.driver=driver;
    }


    private By clickChangePass = By.xpath("//a[normalize-space()='Change password']");
    private By oldPass = By.id("OldPassword");
    private By newPass = By.id("NewPassword");
    private By cofNewPass = By.id("ConfirmNewPassword");



    private By changePassBtn = By.xpath("//button[normalize-space()='Change password']");




    public P06_changePassworg userClickChangePass() {
        driver.findElement(this.clickChangePass).click();
        return this;
    }

    public P06_changePassworg enterOldPass(String OPass) {
        driver.findElement(this.oldPass).sendKeys(OPass);
        return this;
    }

    public P06_changePassworg enterNewPass(String NewPass) {
        driver.findElement(this.newPass).sendKeys(NewPass);
        return this;
    }

    public P06_changePassworg enterCofNewPass(String CNPass) {
        driver.findElement(this.cofNewPass).sendKeys(CNPass);
        return this;
    }

    public P06_changePassworg userClickOnChangePassBtn() {
        driver.findElement(this.changePassBtn).click();
        return this;
    }



}
