package MyFirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;


import java.util.concurrent.TimeUnit;

public class BaseClass {

   public WebDriver driver;

    public void launchBrowser(String browser,String url1) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\Users\\simon\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","\\Users\\simon\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");


        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("gecko")) {
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("check the path");
        }
        System.setProperty("webdriver.edge.driver", "\\Users\\simon\\Downloads\\edgedriver_win64\\msedgedriver.exe");


       driver.navigate().to(url1);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
      //  driver.get(url2);

        String Title = driver.getTitle();
        System.out.println(Title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

    }

    public static void main(String[] args) throws InterruptedException {
        BaseClass obj = new BaseClass();
        obj.launchBrowser("gecko","https:Bestbuy.com");
    }
    }


