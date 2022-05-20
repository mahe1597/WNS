package Modules.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import project.Base.TestBase;
import project.Utility.UtilsManager;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Home extends TestBase {


    public Home() {
        this.driver = driver;
    }

    By btn_Language = By.xpath(".//*[@id='language-dropdown-flag']/span");
    By text_USA_English = By.xpath(".//span[@class='country' and contains(text(),'USA')]");
    By btn_AcceptAllCookies = By.xpath(".//*[@id='onetrust-accept-btn-handler']");
    By btn_FindOutMore_ForeignExchangeSolutions = By.xpath(".//a[contains(@href,'foreign-exchange-solutions')]/span");

    public void validatingTheHomePageTitle() throws Exception {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Moneycorp | Global Payments");
    }

    public void clickOnLanguage() throws Exception {
        UtilsManager.click(btn_Language);
    }

    public void language(String lang){
        switch(lang){
            case "USA English":
                UtilsManager.click(btn_AcceptAllCookies);
                UtilsManager.scrollDownToElementAndClick(text_USA_English);
        }
    }

    public void clickOnFindOutMoreUnderForeignExchangeSolutions() throws Exception {
        UtilsManager.click(btn_FindOutMore_ForeignExchangeSolutions);
    }

}
