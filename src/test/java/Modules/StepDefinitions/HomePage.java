package Modules.StepDefinitions;

import project.Base.TestBase;
import Modules.POM.Home;
import io.cucumber.java.en.And;

public class HomePage {
	public Home home;

	public HomePage(){
		home = new Home();
	}
	@And("^Open the Browser and Site is launched$")
	public void validatingTheHomePageTitle() throws Exception {
		home.validatingTheHomePageTitle();
	}

	@And("^Click on language and change to \"(.*)\"$")
	public void changeLanguage(String value) throws Exception {
		home.clickOnLanguage();
		home.language(value);
	}

	@And("^Click on find out more under Foreign Exchange Solutions$")
	public void clickOnFindOutMoreUnderForeignExchangeSolutions() throws Exception {
		home.clickOnFindOutMoreUnderForeignExchangeSolutions();
	}

}
