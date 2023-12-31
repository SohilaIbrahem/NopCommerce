package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.utlity;

public class P01_RegistrationPage {

    private WebDriver driver;
    Select select;

    public P01_RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By genderFemale = By.xpath("//input[@value='F']");
    private final By firstName = By.xpath("//input[@id='FirstName']");
    private final By lastName = By.xpath("//input[@id='LastName']");
    private final By day = (By.xpath("//select[@name='DateOfBirthDay']"));
    private final By month = By.xpath("//select[@name='DateOfBirthMonth']");
    private final By year = By.xpath("//select[@name='DateOfBirthYear']");
    private final By email = By.xpath("//input[@id='Email']");
    private final By password = By.xpath("//input[@id='Password']");
    private final By confPassword = By.xpath("//input[@id='ConfirmPassword']");
    private By registerBtn = By.xpath("//button[@id='register-button']");
    private final By confMessage = By.xpath("//div[@class=\"result\"]");
    private final By errorMessage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    public P01_RegistrationPage addUserGenderFemale() {
        driver.findElement(this.genderFemale).click();
        return this;
    }

    public P01_RegistrationPage enterFirstName(String FNAME) {
        driver.findElement(this.firstName).sendKeys(FNAME);
        return this;
    }

    public P01_RegistrationPage enterLastName(String LNAME) {
        driver.findElement(this.lastName).sendKeys(LNAME);
        return this;
    }

    public P01_RegistrationPage selectDay() {
        select = new Select(driver.findElement(this.day));
        select.selectByIndex(utlity.generateRandomNumber(1, 30));
        return this;
    }

    public P01_RegistrationPage selectMonth() {
        select = new Select(driver.findElement(this.month));
        select.selectByIndex(utlity.generateRandomNumber(1, 12));
        return this;
    }

    public P01_RegistrationPage selectYear() {
        select = new Select(driver.findElement(this.year));
        select.selectByIndex(utlity.generateRandomNumber(1, 20));
        return this;
    }

    public P01_RegistrationPage enterEmail(String Email) {
        driver.findElement(this.email).sendKeys(Email);
        return this;
    }

    public P01_RegistrationPage enterPassword(String Pssword) {
        driver.findElement(this.password).sendKeys(Pssword);
        return this;
    }

    public P01_RegistrationPage enterConfPassword(String CofPASS) {
        driver.findElement(this.confPassword).sendKeys(CofPASS);
        return this;
    }

    public P01_RegistrationPage getRegisterBtn() {
        driver.findElement(this.registerBtn).click();
        return this;
    }

    //TODO : Assertion method
    public boolean confRegisterSuccessfully() {
        return driver.findElement(this.confMessage).getText().equals("Your registration completed");

    }

    public boolean ErrorMessage() {
        return driver.findElement(this.errorMessage).getText().equals("The specified email already exists");

    }
}
