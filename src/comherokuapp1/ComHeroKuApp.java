package comherokuapp1;


/**
 *  Project-3- ProjectName : com-herokuapp
 *  BaseUrl = http://the-internet.herokuapp.com/login
 *  1. Setup chrome browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current url.
 *  5. Print the page source.
 *  6. Enter the email to email field.
 *  7. Enter the password to password field.
 *  8. Click on Login Button.
 *  9. Print the current url.
 *  10. Refresh the page.
 *  11. Close the browser
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComHeroKuApp {

    //1. Setup Chrome Browser
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        //2. Open Url.
        driver.get(baseUrl);

        //3. Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());

        //4. Print the current url.
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        //6. Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("tomsmith");

        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //8. Click on Login Button.
        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();

        //9. Print the current url.
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //10. Refresh the page.
        driver.navigate().refresh();

        //11. Close the browser.
        driver.quit();
    }
}
