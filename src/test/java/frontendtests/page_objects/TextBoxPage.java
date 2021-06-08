package frontendtests.page_objects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://demoqa.com/text-box")

public class TextBoxPage extends BasePage {

    public final String FULL_NAME_INPUT = "//input[@id='userName']";

    public final String EMAIL_INPUT = "//input[@id='userEmail']";

    public final String CURRENT_ADDRESS_INPUT = "//textarea[@id='currentAddress']";

    public final String PERMANENT_ADDRESS_INPUT = "//textarea[@id='permanentAddress']";

    public final String SUBMIT_BUTTON = "//button[@id='submit']";

    public final String CURRENT_ADDRESS_OUTPUT = "//p[@id='currentAddress']";

    public final String PERMANENT_ADDRESS_OUTPUT = "//p[@id='permanentAddress']";

     String firstName = faker.name().firstName();

     String email = faker.internet().emailAddress();

     String address = faker.address().fullAddress();

    public void openTheTextBoxPage() {
        open();
    }



    public void insertFullName () {
        $(FULL_NAME_INPUT).type(firstName);
    }

    public void insertEmail () {
        $(EMAIL_INPUT).type(email);
    }

    public void insertCurrentAddress() {
        $(CURRENT_ADDRESS_INPUT).type(address);
    }

    public void insertPermanentAddress() {
        $(PERMANENT_ADDRESS_INPUT).type(address);
    }

    public void submit() {
        JSClick($(SUBMIT_BUTTON));
    }

    public boolean currentAddressIsPresent() {
        return $(CURRENT_ADDRESS_OUTPUT).isPresent();
    }

    public boolean permanentAddressIsPresent() {
        return $(PERMANENT_ADDRESS_OUTPUT).isPresent();
    }

}