package common;

public class Config {

    /**
    * Specify the brovser an platform for test
    * CHROME_LINUX
    * CHROME_WIN
    * MOZILLA_WIN
    */
    public static final String BROWSER_AND_PLATFORM = "CHROME_WIN";
    /**
     * Clean browser cookies after each iteration
     * true = clean
     * false = not clean
     */
    public static final Boolean CLEAR_COOKIES = true;
    /**
     * To keep the browser open after all scenario/tests
     * true = Keep the browser open
     * false = Close browser
     */
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /**
     * Clear the directory with the screen before starting the build
     */
    public static final Boolean CLEAR_REPORTS_DIR = true;
}
