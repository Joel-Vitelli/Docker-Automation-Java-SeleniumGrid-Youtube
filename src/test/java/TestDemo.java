import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.academy.crowdar.business.YoutubeSearchBusiness;
import com.academy.crowdar.business.YoutubeSelectFirstResultBusiness;
import com.academy.crowdar.business.interfaces.BusinessInterface;

public class TestDemo {
    /**
     * Descargar previamente el chrome driver
     * https://chromedriver.chromium.org/downloads
     */
    private WebDriver driver;
    private BusinessInterface googleSearchBusiness;
    private BusinessInterface googleSelectFirstResultBusiness;
    @Before
    public void setUpTest() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        googleSearchBusiness = new YoutubeSearchBusiness(driver);
        googleSelectFirstResultBusiness = new YoutubeSelectFirstResultBusiness(driver);
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
        googleSelectFirstResultBusiness.perform("2");
    }

    @After
    public void endTest() {
        driver.quit();
    }
}

