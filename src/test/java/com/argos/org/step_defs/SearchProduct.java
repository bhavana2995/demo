package com.argos.org.step_defs;

import com.argos.org.page_obj.HomePage;
import com.argos.org.page_obj.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchProduct {

    HomePage homePage=new HomePage();
    ResultsPage resultsPage=new ResultsPage();

    @Given("^I am on a homepage$")
    public void i_am_on_a_homepage() {
    }

    @When("^I search for a product$")
    public void i_search_for_a_product() {
        homePage.searchProduct();
    }

    @Then("^I have to see those products$")
    public void i_have_to_see_those_products() {
        String actual=resultsPage.ResultsName();
        assertThat(homePage.searchProduct(),is(equalTo(actual)));
    }
}
