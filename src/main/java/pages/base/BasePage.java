package pages.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By scrollTopButton = By.xpath("//a[@class='scroll-top-button']");
    public final By authWidget = By.xpath("//mat-dialog-container[@role='dialog']");
    public final By authWidgetTitle = By.xpath("//*[@class='header text _600']");
    public final By authWidgetDescription = By.xpath("//*[@class='description text']");
    public final By confidentialityAlert = By.xpath("//div[@class='confidentiality']");
    public final By closeConfidentialityAlert = By.xpath("//a[@title='Закрыть предупреждение']");
    public final By appReady = By.xpath("//platform[contains(@class, 'app-ready')]");
    public final By osagoPageLink = By.xpath("//div[@class='navigation-item']//a[contains(@href, 'osago')][1]");
    public final By datepickerGridCell = By.xpath("//div[contains(@class,'mat-calendar-body-cell-content')]");
    public final By datepickerPeriodButton = By.xpath("//button[contains(@class, 'mat-calendar-period-button')]");
    public final By patepickerPreviousButton = By.xpath("//button[contains(@class, 'dar-previous-button')]");
    public final By patepickerNextButton = By.xpath("//button[contains(@class, 'dar-next-button')]");

    /**
     * The methot for navigating to a specific URL
     **/
    public void goToUrl(String url) {
        driver.get(url);
    }
    /**
     * Wait for visibility of element in DOM model
     **/
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    /**
     * Wait for invisibility of element in DOM model
     **/
    public WebElement waitElementIsInvisiblity(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.invisibilityOf(element));
        return element;
    }
    /**
     * Wait for clickable of element in DOM model
     **/
    public WebElement waitElementIsClickable(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
    /**
     * Check is auth dialog is visible
     */
    public void isAuthWidgetPresent() {
        waitElementIsVisible(driver.findElement(authWidget));
    }
    /**
     * Check is confidentiality alert is visible
     */
    public void isConfidentialityAlertPresent() {
        waitElementIsVisible(driver.findElement(confidentialityAlert));
    }
    /**
     * Scroll to element
     */
    public WebElement scrollToElement(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        return element;
    }
    /**
     * Close ConfidentialityAlert
     */
    public void selectCloseConfidentialityAlert() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(closeConfidentialityAlert));
    }
    /**
     * Osago page link click
     */
    public void selectLinkToOsagoPage () {
        driver.findElement(osagoPageLink).click();
    }
    /**
     * Open Datepicker
     */
    public WebElement selectDatepickerToggleButton (WebElement element) {
        element.click();
        return element;
    }
    /**
     * Enter in combobox value with keyboard
     * @param element combobox element
     * @param keys value to enter
     * @return element
     */
    public WebElement enterComboboxWithKeyboard(WebElement element, String keys){
        element.sendKeys(keys);
        element.sendKeys(Keys.ENTER);
        return element;
    }
    /**
     * Select option in combobox list by Index
     * @param optionsLocator combobox list locator
     * @param selectIndex index
     */
    public void selectComboboxOptionByIndex(By optionsLocator, Integer selectIndex) {
        List<WebElement> options = driver.findElements(optionsLocator);
        options.get(selectIndex).click();
    }
}
