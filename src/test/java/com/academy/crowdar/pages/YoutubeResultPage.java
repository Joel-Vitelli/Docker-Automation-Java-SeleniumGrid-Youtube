package com.academy.crowdar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeResultPage {

    private static final String RESULT_SELECTOR = "#contents > ytd-video-renderer:nth-child(%s)";
    private WebDriver driver;

    public YoutubeResultPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public String getTitleText() {
        return  driver.getTitle();
    }

    public void clickOnResult(String number) {
        WebElement result = driver.findElement(By.cssSelector(String.format(RESULT_SELECTOR, number)));
        result.click();
    }
}

