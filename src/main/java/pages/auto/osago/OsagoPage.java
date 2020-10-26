package pages.auto.osago;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import pages.base.BasePage;

public class OsagoPage extends BasePage {
    public OsagoPage (WebDriver driver) {
        super(driver);
    }

    private final By buttonCalculateAndBuyPolicy = By.xpath("//div[@class='d-desktop container']//button");
    private final By calculateButton = By.xpath("//button[@id='precalc_osago_01']");
    private final By calculationFormError = By.xpath("//p[@class='oe__error']");
    private final By cityInputCombobox = By.xpath("//div[contains(text(), 'Город / населённый пункт')]/..//input");
    private final By spinnerLoader = By.xpath("//div[contains(@class, 'ng-spinner-loader')]");
    private final By cityDropDownPanel = By.xpath("//div[contains(@class, 'ng-dropdown-panel-items')]/div/div[@role='option']");
    private final By birthDateInput = By.xpath("//datepicker[@formcontrolname='birthDate']//input");
    private final By birthDateDatepickerToggleButton = By.xpath("//mat-datepicker-toggle/button");
    private final By markInputCombobox = By.xpath("//div[contains(label, 'Марка автомобиля')]//input");
    private final By carIssueYearInputCombobox = By.xpath("//div[contains(label, 'Год выпуска')]//input");
    private final By carPowerInputCombobox = By.xpath("//div[contains(label, 'Мощность двигателя')]//input");
    private final By unlimitedDriversCheckBox = By.xpath("//input[@formcontrolname='unlimitedDrivers']");
    private final By addAnyDriverButton = By.xpath("//button[@class= 'drivers__add']");
    private final By driverYearsOldInputCombobox = By.xpath("//form//form[contains(@class, 'ng-invalid')]//div[contains(label, 'Возраст водителя')]//input");
    private final By driverDriveExpCombobox = By.xpath("//form//form[contains(@class, 'ng-invalid')]//div[contains(label, 'Стаж водителя')]//input");
    private final By driverNoDtpDriveInputCombobox = By.xpath("//form//form[contains(@class, 'ng-invalid')]//div[contains(label, 'Сколько лет не было аварий')]//input");
    private final By calculationResultBlock = By.xpath("//div[contains(@class, 'result-block')]");
    private final By calculationResultAuthorization = By.xpath("//authorization");
    private final By calculationResultTitle = By.xpath("//div[@class='price-title']");
    private final By calculationResultDescr = By.xpath("//div[@class='result-description']");
    private final By phoneInput = By.xpath("//input[@formcontrolname='phone']");
    private final By codeInput = By.xpath("//input[@formcontrolname='code']");
    private final By resumeButton = By.xpath("//button[@type='submit']");

    /**
     * Select combobox option item by index
     * @param optionIndex
     */
    public void selectOptionIndex(Integer optionIndex) {
        selectComboboxOptionByIndex(cityDropDownPanel, optionIndex);
    }
    /**
     * Push button Calculate and buy policy
     * @return
     */
    public OsagoPage selectCalculateAndBuyPolicy(){
        driver.findElement(buttonCalculateAndBuyPolicy).click();
        return this;
    }
    /**
     * Push button Calculate
     * @return
     */
    public OsagoPage selectCalculateButton() {
        driver.findElement(calculateButton).click();
        return this;
    }
    /**
     * Calculator result block present
     */
    public void isResultBlockPresent() {
        WebElement resultBlock = driver.findElement(calculationResultBlock);
        waitElementIsVisible(resultBlock);
    }
    /**
     * Calculator result block auth form present
     */
    public void isAuthInResultBlockPresent() {
        WebElement authForm = driver.findElement(calculationResultAuthorization);
        waitElementIsVisible(authForm);
    }
    /**
     * Calculator Error Message is present and equals expected
     * @param expectedMessage
     */
    public void isCalculateFormErrorPresent(String expectedMessage) {
        WebElement errorMessage = driver.findElement(calculationFormError);
        waitElementIsVisible(errorMessage);
        Assertions.assertEquals(expectedMessage, errorMessage.getText());
    }
    /**
     * Calculator result block title are exprected
     * @param expected
     */
    public void calcResultTitleAreExpected(String expected) {
        WebElement actual = driver.findElement(calculationResultTitle);
        Assertions.assertEquals(expected, actual.getText());
    }
    /**
     * Calculator result block description are exprected
     * @param expected
     */
    public void calcResultDescrAreExpected(String expected) {
        WebElement actual = driver.findElement(calculationResultDescr);
        Assertions.assertEquals(expected, actual.getText());
    }
    /**
     * Init search city combobox
     * @param city
     * @return
     */
    public OsagoPage enterCity(String city) {
        driver.findElement(cityInputCombobox).sendKeys(city);
        return this;
    }
    /**
     * Wait for load combobox list
     */
    public void waitForListLoad() {
        waitElementIsInvisiblity(driver.findElement(spinnerLoader));
    }
    /**
     * Enter birthDate with keyboard
     * @param birthDate
     * @return
     */
    public OsagoPage enterBirthDate(String birthDate) {
        driver.findElement(birthDateInput).sendKeys(birthDate);
        return this;
    }
    /**
     * Enter mark with keyboard
     * @param mark
     * @return
     */
    public OsagoPage enterMark(String mark) {
        WebElement inputMark = driver.findElement(markInputCombobox);
        enterComboboxWithKeyboard(inputMark, mark);
        return this;
    }
    /**
     * Enter car issue year with keyboard
     * @param carIssueYear
     * @return
     */
    public OsagoPage enterCarIssueYear(String carIssueYear) {
        WebElement imputCarIssoeYear = driver.findElement(carIssueYearInputCombobox);
        enterComboboxWithKeyboard(imputCarIssoeYear, carIssueYear);
        return this;
    }
    /**
     * Open carPower combobox list
     * @return
     */
    public OsagoPage selectCarPowerCombobox() {
        WebElement carPowerCombobox = driver.findElement(carPowerInputCombobox);
        carPowerCombobox.click();
        return this;
    }
    /**
     * Enter driver years old with keyboard
     * @param driverYears
     * @return
     */
    public OsagoPage enterDriverYearsOld(String driverYears) {
        WebElement inputDriverYearsOld = driver.findElement(driverYearsOldInputCombobox);
        enterComboboxWithKeyboard(inputDriverYearsOld, driverYears);
        return this;
    }
    /**
     * Enter driver drive experience with keyboard
     * @param driverDriveExp
     * @return
     */
    public OsagoPage enterDriverDriveExp(String driverDriveExp) {
        WebElement inputDriverDriveExp = driver.findElement(driverDriveExpCombobox);
        enterComboboxWithKeyboard(inputDriverDriveExp, driverDriveExp);
        return this;
    }
    /**
     * Open driver no dtp drive combobox list
     * @return
     */
    public OsagoPage selectDriverNoDtpCombobox() {
        WebElement driverNoDtpDriveCombobox = driver.findElement(driverNoDtpDriveInputCombobox);
        driverNoDtpDriveCombobox.click();
        return this;
    }
    /**
     * Activate checkbox if not activated
     * @return
     */
    public OsagoPage setStateUnlimitedDriversCheckbox(Boolean state) {
        WebElement checkBox = driver.findElement(unlimitedDriversCheckBox);
        if(checkBox.isSelected() != state){
            try {
                checkBox.click();
            }catch (ElementClickInterceptedException e){
                ((JavascriptExecutor)driver).executeScript("arguments[0].click();", checkBox);
            }
        }
        return this;
    }
    /**
     * Open Birth Date datepicker
     */
    public void selectBirthDateDatepickerToggleButton() {
        selectDatepickerToggleButton(driver.findElement(birthDateDatepickerToggleButton));
    }
    /**
     * Click to add driver button
     * @return
     */
    public OsagoPage selectDriversAddButton() {
        WebElement addAnyDriver = driver.findElement(addAnyDriverButton);
        addAnyDriver.click();
        return this;
    }
    /**
     * Enter phone
     * @param phone
     * @return
     */
    public OsagoPage enterPhone(String phone){
        WebElement login = driver.findElement(phoneInput);
        login.sendKeys(phone);
        login.sendKeys(Keys.ENTER);
        return this;
    }
    /**
     * Enter code
     * @param code
     * @return
     */
    public OsagoPage enterCode(String code){
        WebElement loginCode = driver.findElement(codeInput);
        loginCode.sendKeys(code);
        return this;
    }
    public OsagoPage submitResumeButton() {
        WebElement resume = driver.findElement(resumeButton);
        resume.submit();
        return this;
    }

}
