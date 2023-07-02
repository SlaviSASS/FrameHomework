package tests;

import compolents.AdminLeftNavigationBar;
import core.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddNewCustomerPage;
import pages.CustomersPage;
import pages.DashboardPage;
import utils.RandomEmailGenerator;

public class AddNewCustomerTest extends BaseTest {


    @Test
    public void createNewCustomer() {
        LoginPageTest.loginSuccessfully();
        AdminLeftNavigationBar.clickOnCustomersLabel();
        AdminLeftNavigationBar.waitForCustomersButton();
        AdminLeftNavigationBar.clickOnCustomersButton();
        CustomersPage.clickOnAddButton();
        AddNewCustomerPage.writeInFirstNameField("Slavi");
        AddNewCustomerPage.writeInLastNameField("Boychev");
        AddNewCustomerPage.writeInEmailField();
        AddNewCustomerPage.writeInTelephoneNumberField("+35988564654");
        AddNewCustomerPage.writeInPasswordField();
        AddNewCustomerPage.writeInConfirmPasswordField();
        AddNewCustomerPage.clickOnSaveButton();
        CustomersPage.writeInEmailField();
      CustomersPage.clickOnFilterButton();


    }
}



