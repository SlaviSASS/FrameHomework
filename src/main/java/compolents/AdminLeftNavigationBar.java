package compolents;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitTool;

import java.time.Duration;
import core.BasePage;
import org.openqa.selenium.By;
import utils.WaitTool;

public class AdminLeftNavigationBar {

    private static final By CUSTOMERS_LABEL = new By.ByXPath("//*[@id='menu-customer']/a");
    private static final By CUSTOMERS_BUTTON = new By.ByCssSelector("#collapse5 > li:nth-child(1) > a");


    public static void clickOnCustomersLabel() {
        BasePage.clickOnElementByLocator(CUSTOMERS_LABEL);
    }

    public static void clickOnCustomersButton() {

        BasePage.clickOnElementByLocator(CUSTOMERS_BUTTON);
    }


    public static void waitForCustomersButton(){
        WaitTool.waitForElementVisibility(CUSTOMERS_BUTTON, 3);



    }
}
