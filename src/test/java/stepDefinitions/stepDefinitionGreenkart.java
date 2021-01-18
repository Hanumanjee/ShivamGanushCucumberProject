package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.GreenKartPage;
import resources.Base;

public class stepDefinitionGreenkart extends Base {
    public WebDriver driver;
    GreenKartPage greenKartPage;
    String vegetableName = "";
    String text = "";


    @Given("^Initialize browser$")
    public void initialize_browser() throws Throwable {
        driver = initializeDriver();
    }

    @When("^User navigate to Greenkart Homepage$")
    public void user_navigate_to_greenkart_homepage() throws Throwable {
        driver.get(prop.getProperty("url"));
    }

    @Then("^Verify user landed in Homepage$")
    public void verify_user_landed_in_homepage() throws Throwable {
        System.out.println(driver.getCurrentUrl());

    }

    @Given("^User is in GreenKart Landing page$")
    public void user_is_in_greenkart_landing_page() throws Throwable {

    }

    @When("^User clicks on ADDTOCART button$")
    public void user_clicks_on_addtocart_button() throws Throwable {
        greenKartPage = new GreenKartPage(driver);
        greenKartPage.getAddToCartButton().click();


    }

    @Then("^Verify item is added to cart$")
    public void verify_item_is_added_to_cart() throws Throwable {
        System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul")).isDisplayed());
        ;
        vegetableName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/div[1]/p[1]")).getText();
        System.out.println(vegetableName);
        if (vegetableName.contains("1 Kg")) {
            System.out.println("TEST 1 PASSED");
        }
    }

    @And("^User clicks on Cart icon$")
    public void user_clicks_on_cart_icon() throws Throwable {
        greenKartPage.getCartIcon().click();

    }

    @And("^Browser is closed$")
    public void browser_is_closed() throws Throwable {
        driver.close();
    }

    @Then("^Verify items are still present in cart$")
    public void verify_items_are_still_present_in_cart() throws Throwable {
        vegetableName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li/div[1]/p[1]")).getText();
        System.out.println(vegetableName);
        if (vegetableName.contains("1 Kg")) {
            System.out.println("TEST IS PASSED");
        } else {
            System.out.println("TEST IS FAILED");
        }
    }

    @And("^User refresh the browser$")
    public void user_refresh_the_browser() throws Throwable {
        driver.navigate().refresh();
    }

    @And("^User clicks on plus button for 4 times$")
    public void user_clicks_on_plus_button_for_4_times() throws Throwable {
        greenKartPage = new GreenKartPage(driver);
        for (int i = 0; i < 3; i++) {
            greenKartPage.getIncrementButton().click();
        }
    }

    @And("^Verify correct numbers of items are in cart$")
    public void verify_correct_numbers_of_items_are_in_cart() throws Throwable {
        WebElement element = driver.findElement(By.cssSelector("div[class='cart-preview active'] div div p[class='quantity']"));
        System.out.println(element.getText());
    }

    @When("^User searched for  \"([^\"]*)\" vegetable$")
    public void user_searched_for_something_vegetable(String vegetableName) throws Throwable {
        greenKartPage = new GreenKartPage(driver);
        greenKartPage.getSearchBox().clear();
        greenKartPage.getSearchBox().sendKeys(vegetableName);
        Thread.sleep(2001);
    }

    @Then("^Verify ADDED text is popped up$")
    public void verify_added_text_is_popped_up() throws Throwable {
        WebElement element = greenKartPage.getAddToCartButton();
        element.click();
        text = element.getText();

    }
    @Then("^Verify sum of produts matches with amount displayed in cart$")
    public void verify_sum_of_produts_matches_with_amount_displayed_in_cart() throws Throwable {
      String sum=  greenKartPage.getSum().getText();
      if(sum.contains("240")){
          System.out.println(sum + " TEST IS PASS");
      }
      else{
          System.out.println("TEST FAIL");
      }
    }
    @Then("^Verify prices shown up for products$")
    public void verify_prices_shown_up_for_products() throws Throwable {
        System.out.println(greenKartPage.getSum().getText());
    }

    @Then("^Verify cart is empty$")
    public void verify_cart_is_empty() throws Throwable {
      String text=  greenKartPage.getCartEmptyText().getText();
        System.out.println(text + " is shown");

    }

    @And("^User clicks on remove item icon$")
    public void user_clicks_on_remove_item_icon() throws Throwable {
       greenKartPage.getRemoveCartItemIcon().click();
    }
}
