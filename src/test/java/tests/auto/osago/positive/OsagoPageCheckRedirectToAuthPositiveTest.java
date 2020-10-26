package tests.auto.osago.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.OsagoPrecalc.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;

public class OsagoPageCheckRedirectToAuthPositiveTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.selectLinkToOsagoPage();
        osagoPage.selectCalculateAndBuyPolicy();
        basePage.isAuthWidgetPresent();
    }
}
