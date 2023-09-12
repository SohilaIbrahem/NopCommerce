package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class P10_AddToShoppingCart {

  private WebDriver driver;
  private JavascriptExecutor javascriptExecutor;
  public P10_AddToShoppingCart(WebDriver driver)
  {
    this.driver=driver;
    this.javascriptExecutor = (JavascriptExecutor) driver;
  }

  //TODO : define locators
    private final By jewelry = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");

   private final By product = By.xpath("//h2[@class='product-title']//a[normalize-space()='Flower Girl Bracelet']");
    private final  By addProductToCart  = By.xpath("//button[@id='add-to-cart-button-41']");
    private final By confirmationMessage = By.xpath("//p[@class='content']");
    ////p[@class='content']

  public void scrollToBottom() {
    javascriptExecutor.executeScript("scrollBy(0,2500)");
  }

  public P10_AddToShoppingCart UserClickOnJewelry() {
    driver.findElement(this.jewelry).click();
    return this;
  }

  public P10_AddToShoppingCart UserSelectProduct() {
    driver.findElement(this.product).click();
    return this;
  }

  public P10_AddToShoppingCart UserAddProductToCart() {
    driver.findElement(this.addProductToCart).click();
    return this;
  }

  public  boolean CheckConfirmationMessage()
    {      return  driver.findElement(this.confirmationMessage).getText().equals("The product has been added to your");

    }

}
