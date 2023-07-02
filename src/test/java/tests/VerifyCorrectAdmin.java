package tests;

import core.BasePage;
import core.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class VerifyCorrectAdmin extends BaseTest {

    @Test
    public static void verifyCorrectAdmin() {
        LoginPageTest.loginSuccessfully();
        DashboardPage.verifyUsernameLabelText("Milen Strahinski");
    }
}
