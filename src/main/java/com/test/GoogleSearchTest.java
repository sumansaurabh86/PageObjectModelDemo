package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pages.GoogleSearchPage;


public class GoogleSearchTest {

  private static WebDriver driver = null;

    public static void main(String[] args) {

        googleSearch();

    }

    public static void googleSearch(){

        //WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.manage().window().maximize();	//maximize window
        driver.manage().deleteAllCookies();		//delete all cookies

        driver.get("https://www.amazon.com/");

        // enter text in search textbox
        GoogleSearchPage.textboxSearch(driver).sendKeys("shoes");

        // click on search button
        GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);

        driver.close();
        System.out.println("Test Completed successfully");
    }
}
