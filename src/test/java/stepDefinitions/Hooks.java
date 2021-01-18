package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resources.Base;

public class Hooks extends Base {

    @Before("@MobileTest")
    public void beforevaldiation()
    {
        System.out.println("Before Mobile  hook");
    }
//testing pull request
    @After("@MobileTest")
    public void Aftervaldiation()
    {
        System.out.println("  After Mobile before hook");
    }

    @Before("@WebTest")
    public void beforeWebvaldiation()
    {
        System.out.println("Before Web  hook");
    }

    @After("@WebTest")
    public void AfterWebvaldiation()
    {
        System.out.println("  After Web before hook");
    }

    @After("@SeleniumTest")
    public void AfterSeleniumTest()
    {

        driver.quit();
    }
    @After("@SmokeTest")
    public void AfterSmokeTest()
    {

        driver.quit();
    }
    @After("@RegressionTest")
    public void AftertionRegressTest()
    {

        driver.quit();
    }
}
