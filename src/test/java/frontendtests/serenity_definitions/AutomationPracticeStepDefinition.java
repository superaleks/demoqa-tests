package frontendtests.serenity_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import frontendtests.cucumber_steps.AutomationPractiseSteps;
import net.thucydides.core.annotations.Steps;

public class AutomationPracticeStepDefinition {

    @Steps
    AutomationPractiseSteps user;

    @Given("^the user has navigated to the homepage$")
    public void theUserHasNavigatedToTheHomepage() {
        user.navigateToTheHomePage();
    }

    @When("^he navigates to the sign in form$")
    public void heNavigatesToTheSignInForm() {
        user.clickTheLoginLink();
    }


}
