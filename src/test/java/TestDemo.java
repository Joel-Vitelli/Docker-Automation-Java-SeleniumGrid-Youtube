import com.academy.crowdar.business.YoutubeSearchBusiness;
import com.academy.crowdar.business.YoutubeSelectFirstResultBusiness;
import com.academy.crowdar.business.interfaces.BusinessInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import sun.jvm.hotspot.utilities.soql.JSJavaScriptEngine;

import java.net.MalformedURLException;
import java.net.URL;

public class TestDemo {

    private BusinessInterface googleSearchBusiness;
    private BusinessInterface googleSelectFirstResultBusiness;

    Capabilities chromeCapabilities = DesiredCapabilities.chrome();
    Capabilities firefoxCapabilities = DesiredCapabilities.firefox();
    private WebDriver chrome;
    private WebDriver firefox;

    @Before
    public void setUpTest() throws MalformedURLException {

        chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
        firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxCapabilities);
        chrome.manage().window().maximize();
        firefox.manage().window().maximize();
        chrome.get("https://www.youtube.com/");
        firefox.get("https://www.youtube.com/");


        googleSearchBusiness = new YoutubeSearchBusiness(chrome, firefox);
        googleSelectFirstResultBusiness = new YoutubeSelectFirstResultBusiness(chrome, firefox);
    }

    @Test
    public void whenTheUserFindTheWordJavaInYoutube() {
        String searchText = "java";
        googleSearchBusiness.perform(searchText);

    }

    @Test
    public void whenTheUserFindTheWordCrowdarInYoutube() {
        String searchText = "crowdar";
        googleSearchBusiness.perform(searchText);
        googleSelectFirstResultBusiness.perform("5");
    }

    @After
    public void endTest() {
        chrome.quit();
        firefox.quit();
    }
}

