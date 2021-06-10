package frontendtests.page_objects;

import gherkin.StringUtils;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("https://demoqa.com/checkbox")
public class CheckboxPage extends BasePage {

    public final String EXPAND_THE_MENU = "//button[@title='Toggle']";

    public final String HOME_CHECKBOX = "//input[@id='tree-node-home']";

    public final String DOCUMENTS_CHECKBOX = "//input[@id='tree-node-documents']";

    public final String DOWNLOADS_CHECKBOX = "//input[@id='tree-node-downloads']";

    public final String NOTES_CHECKBOX = "//input[@id='tree-node-notes']";

    public final String COMMANDS_CHECKBOX = "//input[@id='tree-node-notes']";

    public final String WORK_SPACE_CHECKBOX = "//input[@id='tree-node-workspace']";

    public final String OFFICE_CHECKBOX = "//input[@id='tree-node-office']";

    public final String WORD_FILE_CHECKBOX = "//input[@id='tree-node-wordFile']";

    public final String TREE_NODE_KEYWORD = "//*[@*[contains(.,'tree-node-')]]";

    public final String RESULT_ID = "//div[@id='result']";

    public final String CHECKED_ITEMS = "//span[@class='text-success']";

    public void expandTheMenu() {
        $(EXPAND_THE_MENU).click();
    }

    public void checkTheHomeCheckbox(){
        JSClick($(HOME_CHECKBOX));
    }

    public boolean result(){
     return $(RESULT_ID).isPresent();
    }

    public List<String> getCheckedItemList() {
        List<WebElement> checkedItems = getDriver().findElements(By.xpath(CHECKED_ITEMS));
        List<String> checkedItemText = new ArrayList<>();
        for (int i = 0; i < checkedItems.size(); i++) {
            checkedItemText.add(checkedItems.get(i).getText());
            System.out.println(checkedItems.get(i).getText());
        }
        return checkedItemText;
    }

    }




