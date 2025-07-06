package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;


public class Baseclass {
    public static WebDriver driver;
    // to use Selenium Interface WebDriver and open Browser

    public static void initializebrowser() {
        ConfigReader.loadConfig();
        String browser = ConfigReader.getProperty("browser").toLowerCase();
        String url = ConfigReader.getProperty("url");
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                throw new RuntimeException("Unsupported Browser");

        }
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void quitBrowser(){
            if(driver != null) {
                driver.quit();
            }

    }
}
