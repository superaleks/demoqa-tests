package frontendtests.serenity_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frontendtests.cucumber_steps.AutomationPractiseSteps;
import net.thucydides.core.annotations.Steps;

import javax.xml.xpath.XPathExpressionException;

import static org.junit.Assert.assertTrue;

public class AutomationPracticeStepDefinition {

    @Steps
    AutomationPractiseSteps user;

    @Given("^that the user wants to fill the form$")
    public void thatTheUserWantsToFillTheForm() {
        user.navigatesToTheHomePage();
        user.opensTheTextBoxPage();
    }

    @When("^he navigates to the form and enters the requested data$")
    public void heNavigatesToTheFormAndEntersTheRequestedData() {
        user.insertsFullName();
        user.insertsEmail();
        user.insertsCurrentAddress();
        user.insertsPermanentAddress();
    }

    @Then("^he can submit succesfully$")
    public void heCanSubmitSuccesfully() {
        user.submitsTheForm();
        assertTrue(user.seesTheCurrentAddress());
        assertTrue(user.seesThePermanentAddress());
    }

    @Given("^that the user needs to check a checkbox$")
    public void thatTheUserNeedsToCheckACheckbox() {
        user.openTheCheckboxPage();
        user.expandTheMenu();

    }

    @When("^he navigates to the checkbox and selects it$")
    public void heNavigatesToTheCheckboxAndSelectsIt()  {
        user.checkTheHomeCheckbox();
    }

    @Then("^he can observe the change$")
    public void heCanObserveTheChange() {
        assertTrue(user.observesThatTheresultIsPresent());
        user.getsCheckedItemList(); // to add assertions here
    }
}
