package Modules.StepDefinitions;

import Modules.POM.ForeignExchangeSolutions;
import Modules.POM.Home;
import io.cucumber.java.en.And;

public class ForeignExchangeSolutionPage {
	public Modules.POM.ForeignExchangeSolutions ForeignExchangeSolutionsPage;

	public ForeignExchangeSolutionPage(){
		ForeignExchangeSolutionsPage = new ForeignExchangeSolutions();
	}

	@And("^Validate the Foreign Exchange Solutions Page$")
	public void validatingForeignExchangeSolutionsPage() throws Exception {
		ForeignExchangeSolutionsPage.validatingForeignExchangeSolutionsPage();
	}

	@And("^Search for \"(.*)\"$")
	public void search(String value) throws Exception {
		ForeignExchangeSolutionsPage.search(value);
	}

	@And("^Validate the international payment result page$")
	public void validatingTheInternationalPaymentSearchPage() throws Exception {
		ForeignExchangeSolutionsPage.validatingTheInternationalPaymentSearchPage();
	}

	@And("^Validate the each article which is start with https://www.moneycorp.com/en-us/ link$")
	public void getAllArticles() throws Exception {
		ForeignExchangeSolutionsPage.getAllArticles();
	}

}
