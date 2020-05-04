package com.academy.crowdar.business;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.academy.crowdar.business.interfaces.BusinessInterface;
import com.academy.crowdar.pages.YoutubeHomePage;
import com.academy.crowdar.pages.YoutubeResultPage;

public class YoutubeSearchBusiness implements BusinessInterface {
    private YoutubeHomePage homePage;
    private YoutubeResultPage resultPage;

    public YoutubeSearchBusiness(WebDriver chrome, WebDriver firefox) {
        super();
        this.homePage = new YoutubeHomePage(chrome, firefox);
        this.resultPage = new YoutubeResultPage(chrome, firefox);
    }

    public void perform(String text) {
        homePage.completeTextChrome(text);
        homePage.clickButtonChrome();
        homePage.completeTextFirefox(text);
        homePage.clickButtonFirefox();

        Assert.assertEquals(text + " - YouTube", resultPage.getTitleTextChrome());
        Assert.assertEquals(text + " - YouTube", resultPage.getTitleTextFirefox());
    }

}