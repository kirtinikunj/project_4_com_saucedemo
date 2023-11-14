package homework_week_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class Project_4_Com_Saucedemo {

    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //setup browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        // Open URL
        driver.get(baseUrl);

        //Print the title of the page.
        System.out.println("The title of the page is : " + driver.getTitle());

        // Print the current url.
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        // Print the page source.
        System.out.println("The source of page is : " + driver.getPageSource());

        // Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("error_user");

        // Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click on Login Button
        driver.findElement(By.id("login-button")).click();

        // Print the current url.
        System.out.println("After clicking login button, current url is : " + driver.getCurrentUrl());

        // Navigate to baseUrl
        driver.navigate().back();

        //Refresh the page
        driver.navigate().refresh();

        // Close the browser.
        driver.quit();
    }
}
