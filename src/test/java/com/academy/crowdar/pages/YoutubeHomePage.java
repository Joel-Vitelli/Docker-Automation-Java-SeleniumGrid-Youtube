package com.academy.crowdar.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeHomePage {

    private WebDriver chrome;
    private WebDriver firefox;

    public YoutubeHomePage(WebDriver chrome, WebDriver firefox) {
        super();
        this.chrome = chrome;
        this.firefox = firefox;
    }

    public void completeTextChrome(String texto) {
        WebElement searchChrome = chrome.findElement(By.cssSelector("#search-input.ytd-searchbox-spt input"));
        searchChrome.clear();
        searchChrome.sendKeys(texto);
        searchChrome.sendKeys(Keys.TAB);
    }

    public void completeTextFirefox(String texto) {
        WebElement searchFirefox = firefox.findElement(By.cssSelector("#search-input.ytd-searchbox-spt input"));
        searchFirefox.clear();
        searchFirefox.sendKeys(texto);
        searchFirefox.sendKeys(Keys.TAB);
        firefox.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void clickButtonChrome() {
        WebElement btnSearchChrome = chrome.findElement(By.cssSelector("#search-icon-legacy"));
        btnSearchChrome.click();

        chrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
    public void clickButtonFirefox() {
        WebElement btnSearchfirefox = firefox.findElement(By.cssSelector("#search-icon-legacy"));
        btnSearchfirefox.click();

        firefox.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


}
