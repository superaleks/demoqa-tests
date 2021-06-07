package frontendtests.page_objects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://demoqa.com/checkbox")
public class CheckboxPage extends BasePage {

    public final String EXPAND_THE_MENU = "//button[@title='Toggle']";

    public final String DESKTOP_CHECKBOX = "//input[@id='tree-node-desktop']";

    public final String DOCUMENTS_CHECKBOX = "//input[@id='tree-node-documents']";

    public final String DOWNLOADS_CHECKBOX = "//input[@id='tree-node-downloads']";

    public final String NOTES_CHECKBOX = "//input[@id='tree-node-notes']";

    public final String COMMANDS_CHECKBOX = "//input[@id='tree-node-notes']";

    public final String WORK_SPACE_CHECKBOX = "//input[@id='tree-node-workspace']";

    public final String OFFICE_CHECKBOX = "//input[@id='tree-node-office']";

    public final String WORD_FILE_CHECKBOX = "//input[@id='tree-node-wordFile']";

    public final String TREE_NODE_KEYWORD = "//*[@*[contains(.,'tree-node-')]]";

    public void expandTheMenu() {
        $(EXPAND_THE_MENU).click();
    }

    public List<String> getAllCheckboxIds() {
       List <WebElement> checkBoxes = getDriver().findElements(By.xpath(TREE_NODE_KEYWORD));
       List <String> checkBoxIds = new ArrayList<>();
       for (int i = 0; i < checkBoxes.size(); i++) {
           checkBoxIds.add(checkBoxes.get(i).getAttribute("id"));
        }
    return checkBoxIds;
    }

    public List<String> createXpathsFromAllCheckboxes()  {
        List <String> xpaths = new ArrayList<>();
        for (int i = 0; i < this.getAllCheckboxIds().size() ; i++) {
            if(this.getAllCheckboxIds().get(i) != ""){
                this.getAllCheckboxIds().get(i);
                xpaths.add("//input[@id='"+ this.getAllCheckboxIds().get(i) + "'");
                try {
                    $(xpaths.get(i)).click();
                } catch (InvalidSelectorException e) {
                    e.printStackTrace();
                }
            }
        }
        return xpaths;

    }


}
