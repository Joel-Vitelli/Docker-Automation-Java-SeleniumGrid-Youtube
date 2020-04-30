package com.academy.crowdar.business;

import org.openqa.selenium.WebDriver;

import com.academy.crowdar.business.interfaces.BusinessInterface;
import com.academy.crowdar.pages.YoutubeResultPage;

public class YoutubeSelectFirstResultBusiness implements BusinessInterface {
    private YoutubeResultPage resultPage;

    public YoutubeSelectFirstResultBusiness(WebDriver driver) {
        super();
        this.resultPage = new YoutubeResultPage(driver);
    }

    public void perform(String number) {
        resultPage.clickOnResult(number);
    }
}

