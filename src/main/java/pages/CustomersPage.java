package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import utils.EmailGenerator;

public class CustomersPage extends BasePage{
    String email;

    @BeforeClass
    public void setUp() {
        email = EmailGenerator.generateRandomEmail();
    }


    private static final By ADD_NEW_CUSTOMER_BUTTON = new By.ByXPath("//i[@class=\"fa fa-plus\"]/ ..");
    private static final By FILTER_BY_EMAIL_FIELD = new By.ByXPath("//input[@id=\"input-email\"]");
private static final By FILTER_BUTTON = new By.ByXPath("//*[@id=\"button-filter\"]");
private static final By EXPECTED_EMAIL = new By.ByXPath("//*[@id=\"form-customer\"]/table/tbody/tr/td[3]");


    public static void clickOnAddButton() {
        BasePage.clickOnElementByLocator(ADD_NEW_CUSTOMER_BUTTON);
    }

    public static void writeInEmailField(){
 //       driver.findElement(FILTER_BY_EMAIL_FIELD).sendKeys(RandomEmailGenerator.generateRandomEmail());
        driver.findElement(FILTER_BY_EMAIL_FIELD).sendKeys(EmailGenerator.generateRandomEmail());
    }
    public static void clickOnFilterButton(){
        driver.findElement(FILTER_BUTTON).click();
    }
public static void verifyCustomerIsCreated(){
        String actualCustomerCreated = driver.findElement(EXPECTED_EMAIL).getText();
        String expectedCustomerIsCreatedText = EmailGenerator.generateRandomEmail() ;
    Assert.assertEquals(expectedCustomerIsCreatedText, actualCustomerCreated);
}
}
