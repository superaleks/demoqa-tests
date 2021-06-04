package frontendtests.cucumber_steps;


import frontendtests.page_objects.BasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class AutomationPractiseSteps extends ScenarioSteps {

    BasePage basePage;

    @Step("Navigate to the homepage")
    public void navigateToTheHomePage() {
        basePage.navigateToTheHomePage();
    }

    @Step("Click the Sign In link")
    public void clickTheLoginLink() {
        basePage.clickTheLoginLink();
    }

}
