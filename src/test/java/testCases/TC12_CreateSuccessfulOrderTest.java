package testCases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P013_Checkout;
import pages.P02_LoginPage;
import pages.P12_CreateSuccessfulOrder;
import utilities.utlity;

import static testCases.TC01_RegistrationTest.*;

public class TC12_CreateSuccessfulOrderTest extends TestBase {

    static Faker faker = new Faker();
    public static String City = faker.address().city();
    public static String Address = faker.address().streetAddress();
    public static String Code = faker.address().zipCode();
    public static String PhoneNumber = faker.phoneNumber().cellPhone();

    @Test(description = "Validate That User Can Create Order")
    public void CreateOreder() {
        //TODO: user add products to cart
        new P12_CreateSuccessfulOrder(driver).UserClickOnBooks().UserChooseBook().UserClickOnJewelry().UserChooseJewelry().
                UserClickOnShoppingCart().UserClickOnAgreeRadioButton().UserClickOnCheckoutButton();
        //TODO: user login
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD).UserClickLogin();
        new P12_CreateSuccessfulOrder(driver).UserClickOnAgreeRadioButton().UserClickOnCheckoutButton();
        //TODO: User payment to complete order
        new P013_Checkout(driver).UserSelectCountryDropdown().
                UserEntertCity(City).UserEnterAddress(Address).UserEnterZipCode(Code).
                UserEnterPhoneNumber(PhoneNumber).UserClickOnContinueButton().UserClickOnShippingButton().
                UserClickOnContinuePaymentButton().UserClickOnPaymentInfoButton().getConfirmButton();
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "Checkout");

    }

}
