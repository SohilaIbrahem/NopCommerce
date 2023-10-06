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

    private final By forgetPass = By.xpath("//a[normalize-space()='Forgot password?']");

    private final By email = By.xpath("//input[@id='Email']");

    private final By recoverBtn =By.xpath("//button[@name='send-email']");
    private final By ConfermationMessage=By.xpath("//p[contains(text(),'Email with instructions has been sent to you.')]");
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
    public boolean CheckConfirmationMessage()
    {
        return driver.findElement(this.ConfermationMessage).isDisplayed();
    }
}
