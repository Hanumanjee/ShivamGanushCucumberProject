package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver initializeDriver() {
        FileInputStream fis;
        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\global.properties");
            prop = new Properties();
            prop.load(fis);

            String browserName = prop.getProperty("browser"); //from properties file
            //String browserName= System.getProperty("browser"); //from Maven
            System.out.println(browserName);

            if (browserName.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browserName.equals("chromeheadless")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
                driver = new ChromeDriver(options);

            } else if (browserName.equals("IE")) {
                //ie driver code
            }

           // driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}
