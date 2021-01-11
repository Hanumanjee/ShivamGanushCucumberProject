package resources;

import org.openqa.selenium.WebDriver;

public class Test extends Base{

    public static void main(String[] args) {
        WebDriver driver=initializeDriver();
        driver.get(prop.getProperty("url"));
    }
}
