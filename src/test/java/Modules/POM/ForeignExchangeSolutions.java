package Modules.POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project.Base.TestBase;
import project.Utility.UtilsManager;
import java.util.List;


public class ForeignExchangeSolutions extends TestBase {


    public ForeignExchangeSolutions() {
        this.driver = driver;
    }
    By textbox_Search = By.xpath("(.//input[@id='nav_search'])[2]");
    By btn_Search = By.xpath("(.//input[@type='submit'])[2]");
    By lst_All_Articles = By.xpath(".//div[@class='results-wrapper']//a[contains(@href,'/en-us')]");

    By btn_ShowMoreResults = By.xpath(".//a[@class='show-more show-more-search']");


    public void validatingForeignExchangeSolutionsPage() throws Exception {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Foreign Exchange Solutions | moneycorp USA");
    }

    public void search(String value) throws Exception {
        UtilsManager.sendText(textbox_Search,value);
        UtilsManager.click(btn_Search);
    }

    public void validatingTheInternationalPaymentSearchPage() throws Exception {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Search");
    }


    public void getAllArticles() throws Exception {
        List<WebElement> ele = driver.findElements(lst_All_Articles);
        for (int i=0;i< ele.size();i++){
            System.out.println(ele.get(i).getText());
        }

    }

}
