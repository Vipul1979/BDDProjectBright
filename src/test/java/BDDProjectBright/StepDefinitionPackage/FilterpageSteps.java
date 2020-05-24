package BDDProjectBright.StepDefinitionPackage;

import BDDProjectBright.PageObjectPackage.Filterpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterpageSteps {
    Filterpage filterpage = new Filterpage();
    @Given("^user is on the result page of the running filter$")
    public void user_is_on_the_result_page_of_the_running_filter() throws Throwable {
    filterpage.runingPageassertion();
    }

    @When("^user click on one of the product$")
    public void user_click_on_one_of_the_product() throws Throwable {
        filterpage.clickonproduct();
    }

    @Then("^user should able to see that product to add in basket$")
    public void user_should_able_to_see_that_product_to_add_in_basket() throws Throwable {
       filterpage.runingproductassert();
        // Write code here that turns the phrase above into concrete actions
    }
}
