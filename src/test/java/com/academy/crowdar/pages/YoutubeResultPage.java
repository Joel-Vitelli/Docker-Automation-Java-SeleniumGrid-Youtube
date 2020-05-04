package com.academy.crowdar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeResultPage {

    private static final String RESULT_SELECTOR = "#contents > ytd-video-renderer:nth-child(%s)";
    private WebDriver chrome;
    private WebDriver firefox;

    public YoutubeResultPage(WebDriver chrome, WebDriver firefox) {
        super();
        this.chrome = chrome;
        this.firefox = firefox;
    }

    public String getTitleTextChrome() {
        return  chrome.getTitle();

    }

    public String getTitleTextFirefox() {
        return  firefox.getTitle();

    }

    public void clickOnResultChrome(String number) {
        WebElement resultChrome = chrome.findElement(By.cssSelector(String.format(RESULT_SELECTOR, number)));
        resultChrome.click();

    }

    public void clickOnResultFirefox(String number) {
        WebElement resultFirefox = firefox.findElement(By.cssSelector(String.format(RESULT_SELECTOR, number)));
        resultFirefox.click();
    }
}

