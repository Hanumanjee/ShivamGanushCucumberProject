//package stepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import pageObjects.GreenKartPage;
//import resources.Base;
//
//
//public class stepDefinationSearchVegetables extends Base {
//    static WebDriver driver;
//
//    WebElement element;
//    GreenKartPage greenKartPage;
//    public static Logger log = LogManager.getLogger(Base.class.getName());
//
//    @Given("^Initialize browser$")
//    public void initialize_browser() throws Throwable {
//        driver = initializeDriver();
//        log.info("Log Message: Driver is initialize successfully");
//    }
//
//    @And("^Landing the GreenKart page$")
//    public void landing_the_greenkart_page() throws Throwable {
//        driver.get(prop.getProperty("url"));
//        System.out.println(driver.getTitle());
//        log.info("Log Message: Display Landing page successfully");
//    }
//
//    @When("^User enter \"([^\"]*)\" in search box$")
//    public void user_enter_something_in_search_box(String vegetableName) throws Throwable {
//        greenKartPage = new GreenKartPage(driver);
//        element = greenKartPage.getSearchBox();
//        element.sendKeys(vegetableName);
//        log.info("Log Message: Enter vegetable name successfully");
//    }
//
//    @Then("^Validate Cucumber vegetable is displayed$")
//    public void validate_cucumber_vegetable_is_displayed() throws Throwable {
//        System.out.println("Need find the vegetable name");
//        greenKartPage = new GreenKartPage(driver);
//        String vegName = greenKartPage.getProductNameCucumber().getText();
//        System.out.println("Displayed Vegetable Name is: " + vegName);
//        Assert.assertEquals("Cucumber - 1 Kg", vegName);
//        log.info("Log Message: Validate search vegetable successfully");
//    }
//
//
//    @And("^Close the browser$")
//    public void close_the_browser() throws Throwable {
//        driver.close();
//
//        log.info("Log Message: Driver closed successfully");
//    }
//
//    @And("^Increase the item numbers by clicking plus button$")
//    public void increase_the_item_numbers_by_clicking_plus_button() throws Throwable {
//        greenKartPage = new GreenKartPage(driver);
//        for (int i = 1; i <= 5; i++) {
//            greenKartPage.getCucumberIncrementButton().click();
//
//        }
//        String itemNumber = greenKartPage.getCucumberIncrementNumber().getAttribute("value");
//        System.out.println("The Item Number is: "+itemNumber);
//    }
//
//    @Then("^Validate item numbers$")
//    public void validate_item_numbers() throws Throwable {
//        greenKartPage = new GreenKartPage(driver);
//        String itemNumber = greenKartPage.getCucumberIncrementNumber().getAttribute("value");
//        System.out.println("The Item Number is: "+itemNumber);
//
//    }
//    @Then("^User click the Add Item button$")
//    public void user_click_the_add_item_button() throws Throwable {
//        greenKartPage = new GreenKartPage(driver);
//        greenKartPage.getCucumberAddBtn().click();
//    }
//
//}
