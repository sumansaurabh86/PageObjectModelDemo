package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    private static WebElement element = null ;

    public static WebElement textboxSearch(WebDriver driver){

        element = driver.findElement(By.id("twotabsearchtextbox"));
        return element;
    }


    public static WebElement buttonSearch(WebDriver driver){

        element = driver.findElement(By.id("nav-search-submit-button"));
        return element;
    }
}
