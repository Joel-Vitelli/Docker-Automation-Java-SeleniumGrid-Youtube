package com.academy.crowdar.business;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.academy.crowdar.business.interfaces.BusinessInterface;
import com.academy.crowdar.pages.YoutubeHomePage;
import com.academy.crowdar.pages.YoutubeResultPage;

public class YoutubeSearchBusiness implements BusinessInterface {
    private YoutubeHomePage homePage;
    private YoutubeResultPage resultPage;

    public YoutubeSearchBusiness(WebDriver driver) {
        super();
        this.homePage = new YoutubeHomePage(driver);
        this.resultPage = new YoutubeResultPage(driver);
    }

    public void perform(String text) {
        homePage.completeText(text);
        homePage.clickButton();

        Assert.assertEquals(text + " - YouTube", resultPage.getTitleText());
    }
}