package frontendtests.page_objects;

import com.github.javafaker.Faker;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Array;

public class BasePage extends PageObject {

    final Faker faker = new Faker();

    public static final String LOG_IN_LINK = "//a[@class='login']";

      public void navigateToTheHomePage() {
          open();
      }


}
