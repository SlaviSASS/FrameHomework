package pages;

import org.apache.commons.lang3.RandomStringUtils;
import core.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import utils.RandomEmailGenerator;

public class AddNewCustomerPage extends BasePage {
    String email;

    @BeforeClass
    public void setUp() {
        email = RandomEmailGenerator.generateRandomEmail();
    }
    private static final By FIRST_NAME_FIELD = new By.ByXPath("//*[@id=\"input-firstname\"]");
    private static final By LAST_NAME_FIELD = new By.ByXPath("//*[@id=\"input-lastname\"]");
    private static final By EMAIL = new By.ByXPath("//*[@id=\"input-email\"]");
    private static final By TELEPHONE_NUMBER = new By.ByXPath("//*[@id=\"input-telephone\"]");
    private static final By PASSWORD = new By.ByXPath("//*[@id=\"input-password\"]");
    private static final By CONFIRM_PASSWORD = new By.ByXPath("//*[@id=\"input-confirm\"]");
    private static final By SAVE_BUTTON = new By.ByXPath("//button[@type=\"submit\"]");
    private static final String password =RandomStringUtils.randomAlphanumeric(8);


    public static void writeInFirstNameField(String firstname) {
        driver.findElement(FIRST_NAME_FIELD).sendKeys(firstname);
    }

    public static void writeInLastNameField(String lastname) {
        driver.findElement(LAST_NAME_FIELD).sendKeys(lastname);
    }

    public static void writeInEmailField() {

//        String prefix = RandomStringUtils.randomAlphabetic(7);
//        String sufix = RandomStringUtils.randomAlphabetic(5);
//        String domain = RandomStringUtils.randomAlphabetic(3);
//        String emailAddress = prefix + "@" + sufix + "." + domain;
        driver.findElement(EMAIL).sendKeys(RandomEmailGenerator.generateRandomEmail());
    }

    public static void writeInTelephoneNumberField(String phoneNumber) {
        driver.findElement(TELEPHONE_NUMBER).sendKeys(phoneNumber);
    }


public static void writeInPasswordField(){
        driver.findElement(PASSWORD).sendKeys(password);
}
public static void writeInConfirmPasswordField(){
        driver.findElement(CONFIRM_PASSWORD).sendKeys(password);
}
public static void clickOnSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
}

}
