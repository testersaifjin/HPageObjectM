package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;
    String browser;
    String url;

//    public DriverManager()
//    {
//        PageFactory.initElements(driver, this);
//    }

    public void getProperties() throws IOException
    {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\config.properties");
        properties.load(fis);
        browser = properties.getProperty("browser");
        url = properties.getProperty("url");


    }

    public void invokeBrowser()
    {

        if (browser.equalsIgnoreCase("firefox"))
        {
//            System.setProperty("Webdriver.gecko.driver", "webdriver.gecko.driver\", \"C:\\Users\\sjain1\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")) {
//            System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sjain1\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }


    public void closeBrowser()
    {
        driver.quit();
    }
}
