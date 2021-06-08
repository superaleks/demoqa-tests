package frontendtests.cucumber_steps;

import frontendtests.page_objects.BasePage;
import frontendtests.page_objects.CheckboxPage;
import frontendtests.page_objects.TextBoxPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import java.util.List;

public class AutomationPractiseSteps extends ScenarioSteps {

    BasePage basePage;
    TextBoxPage textBoxPage;
    CheckboxPage checkboxPage;

    @Step("Navigate to the homepage")
    public void navigatesToTheHomePage() {
        basePage.navigateToTheHomePage();
    }

    @Step("Open the text box page")
    public void opensTheTextBoxPage() {
        textBoxPage.openTheTextBoxPage();
    }

    @Step("Enter the first name to the form")
    public void insertsFullName() {
        textBoxPage.insertFullName();
    }

    @Step("Enter the email to the form")
    public void insertsEmail(){
        textBoxPage.insertEmail();
    }

    @Step("Insert current address")
    public void insertsCurrentAddress() {
        textBoxPage.insertCurrentAddress();
    }

    @Step("Insert permanent address")
    public void insertsPermanentAddress(){
        textBoxPage.insertPermanentAddress();
    }

    @Step("Submit the form with complete data")
    public void submitsTheForm(){
        textBoxPage.submit();
    }

    @Step("Check for the presence of the current address")
    public boolean seesTheCurrentAddress() {
        return textBoxPage.currentAddressIsPresent();
    }

    @Step("Check for the presence of the permanent address")
    public boolean seesThePermanentAddress() {
        return textBoxPage.permanentAddressIsPresent();
    }

    @Step("Open the checkbox page")
    public void openTheCheckboxPage() {
        checkboxPage.open();
    }

    @Step("Expand the menu")
    public void expandTheMenu() {
        checkboxPage.expandTheMenu();
    }

    @Step("Check the 'Home' checkbox")
    public void checkTheHomeCheckbox(){
        checkboxPage.checkTheHomeCheckbox();
    }

    @Step("Verify the presence of the result list")
    public boolean observesThatTheresultIsPresent(){
        return checkboxPage.result();
    }

    @Step("Obtain the list of checked items")
    public List<String> getsCheckedItemList() {
        return checkboxPage.getCheckedItemList();
    }


}
