package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenKartPage {
    private WebDriver driver;

    public GreenKartPage(WebDriver driver) {

        this.driver = driver;

    }

    private By searchBox = By.cssSelector(".search-keyword");
    //  private By productName =By.cssSelector("h4[class='product-name']");
    private By productNameCucumber = By.xpath("//h4[contains(text(), 'Cucumber')]");
    private By cucumberIncrementSign = By.xpath("//h4[contains(text(), 'Cucumber')]/following-sibling::div[1]/a[@class='increment']");
    private By cucumberIncrementNumber = By.xpath("//h4[contains(text(), 'Cucumber')]/following-sibling::div[1]/input");
    private By productName = By.xpath("//h4");
    private By cucumberAddButton = By.xpath("//h4[contains(text(), 'Cucumber')]/following-sibling::div[@class='product-action']/button");
    private By incrementButton = By.cssSelector(" a[class='increment']");
    private By addToCartBtn = By.xpath("//button[text()='ADD TO CART']");
    private By cartIcon = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
    private By productNumbers = By.cssSelector("div[class='cart-preview active'] div div p[class='quantity']");
    private By proceedToCheckoutBtn = By.xpath("//div[@class='cart-preview active']//div/button");
    private By purchasedProductName = By.cssSelector("p[class='product-name']");
    private By sum = By.cssSelector("div[class='cart-preview active'] div div p[class='amount']");
    private By cartEmptyText = By.xpath("//div[@class='cart-preview active']//div//div//h2[contains(text(),'You cart is empty!')]");
    private By removeCartItemIcon = By.xpath("(//a[@class='product-remove'])[1]");
    //

    //methods

    public WebElement getRemoveCartItemIcon(){
        return driver.findElement(removeCartItemIcon);
    }

    public WebElement getCartEmptyText(){
        return driver.findElement(cartEmptyText);
    }
    public WebElement getSum(){
        return driver.findElement(sum);
    }

    public WebElement getProductNumbers(){
        return driver.findElement(productNumbers);
    }

    public WebElement getSearchBox() {    //  private By productName =By.cssSelector("h4[class='product-name']"); //h4[contains(text(), 'Cucumber')]

        return driver.findElement(searchBox);
    }

    public WebElement getProductName() {
        return driver.findElement(productName);
    }

    public WebElement getProductNameCucumber() {
        return driver.findElement(productNameCucumber);
    }

    public WebElement getCucumberAddBtn() {
        return driver.findElement(cucumberAddButton);
    }

    public WebElement getCucumberIncrementButton() {
        return driver.findElement(cucumberIncrementSign);
    }

    public WebElement getCucumberIncrementNumber() {
        return driver.findElement(cucumberIncrementNumber);
    }

    public WebElement getIncrementButton() {
        return driver.findElement(incrementButton);
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartBtn);
    }

    public WebElement getCartIcon() {
        return driver.findElement(cartIcon);
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(proceedToCheckoutBtn);
    }

    public WebElement getPurchesedProductName() {
        return driver.findElement(purchasedProductName);
    }

}
