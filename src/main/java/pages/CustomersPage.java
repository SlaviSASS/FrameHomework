package pages;

import core.BasePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import utils.RandomEmailGenerator;

public class CustomersPage extends BasePage{
    String email;

    @BeforeClass
    public void setUp() {
        email = RandomEmailGenerator.generateRandomEmail();
    }


    private static final By ADD_NEW_CUSTOMER_BUTTON = new By.ByXPath("//i[@class=\"fa fa-plus\"]/ ..");
    private static final By FILTER_BY_EMAIL_FIELD = new By.ByXPath("//input[@id=\"input-email\"]");
private static final By FILTER_BUTTON = new By.ByXPath("//*[@id=\"button-filter\"]");

    public static void clickOnAddButton() {
        BasePage.clickOnElementByLocator(ADD_NEW_CUSTOMER_BUTTON);
    }
// тук странното е че този метод работи защото локатора е същия.
    public static void writeInEmailField(){
        driver.findElement(FILTER_BY_EMAIL_FIELD).sendKeys(RandomEmailGenerator.generateRandomEmail());

    }
    public static void clickOnFilterButton(){
        driver.findElement(FILTER_BUTTON).click();
    }

}
