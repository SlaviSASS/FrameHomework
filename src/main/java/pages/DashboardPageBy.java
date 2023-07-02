package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitTool;

import java.time.Duration;

public class DashboardPageBy extends BasePage{

    private static final By USERNAME_LINK = new By.ByXPath("//*[@id='menu-customer']/a");
    private static final By LOGOUT_BUTTON = new By.ByXPath("//i[@class=\"fa fa-sign-out\"]");


    public static void clickOnLogoutButton (){
        BasePage.clickOnElementByLocator(LOGOUT_BUTTON);
    }
}