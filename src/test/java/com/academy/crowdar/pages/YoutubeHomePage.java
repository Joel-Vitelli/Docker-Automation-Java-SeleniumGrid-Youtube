package com.academy.crowdar.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeHomePage {

    private WebDriver driver;

    public YoutubeHomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void completeText(String texto) {
        WebElement search = driver.findElement(By.cssSelector("#search-input.ytd-searchbox-spt input"));
        search.clear();
        search.sendKeys(texto);
        search.sendKeys(Keys.TAB);
    }

    public void clickButton() {
        WebElement btnSearch = driver.findElement(By.cssSelector("#search-icon-legacy"));
        btnSearch.click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
