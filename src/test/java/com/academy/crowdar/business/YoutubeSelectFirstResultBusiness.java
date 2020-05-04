package com.academy.crowdar.business;

import org.openqa.selenium.WebDriver;

import com.academy.crowdar.business.interfaces.BusinessInterface;
import com.academy.crowdar.pages.YoutubeResultPage;

public class YoutubeSelectFirstResultBusiness implements BusinessInterface {
    private YoutubeResultPage resultPage;


    public YoutubeSelectFirstResultBusiness(WebDriver chrome,WebDriver firefox) {
        super();
        this.resultPage = new YoutubeResultPage(chrome,firefox);
    }

    public void perform(String number) {
        resultPage.clickOnResultChrome (number);
        resultPage.clickOnResultFirefox(number);
    }
}

