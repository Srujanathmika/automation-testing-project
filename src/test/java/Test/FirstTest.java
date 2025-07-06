package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    public static void main(String[] args) {
        //  Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //  Maximize window
        driver.manage().window().maximize();

        //  Step 1: Open URL
        driver.get("https://automationexercise.com");

        //  Step 2: Click on 'Signup / Login' using XPath
        WebElement signupButton = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signupButton.click();

        //  Step 3: Print the page title
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        //  Step 4: Close browser
        driver.quit();
    }
}