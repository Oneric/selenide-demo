package tests.auto.osago.negative;

import org.junit.jupiter.api.Test;
import pages.base.BasePage;
import tests.base.BaseTest;

import static constants.Constant.OsagoPrecalc.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;

public class OsagoPageCheckCalkNegativeTest extends BaseTest {

    @Test
    public void ceckIsFastCalcErrorMessage() {
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.selectLinkToOsagoPage();
        basePage.isConfidentialityAlertPresent();
        basePage.selectCloseConfidentialityAlert();
        osagoPage.enterCity(CITY);
        osagoPage.waitForListLoad();
        osagoPage.selectOptionIndex(2);
        osagoPage.selectCalculateButton();
        osagoPage.isCalculateFormErrorPresent(ERROR_MESSAGE);
    }
}
