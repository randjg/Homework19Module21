package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStepDef extends BaseTest{

    protected HomePage homePage;

    @Then("user is directed to homepage")
    public void userIsOnHomepage(){
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

}
