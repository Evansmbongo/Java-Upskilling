import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        // Creates a new instance of FirefoxOptions. This class is used to manage options specific to FirefoxDriver.
        FirefoxOptions options = new FirefoxOptions();

        // Creates a new instance of FirefoxProfile. This profile allows you to configure Firefox settings.
        FirefoxProfile profile = new FirefoxProfile();

        // Sets the preference to save downloaded files to a specified folder (2 = use a custom download path).
        profile.setPreference("browser.download.folderList", 2);

        // Sets the directory path where downloads should be saved. Adjust the path as necessary for your machine.
        profile.setPreference("browser.download.dir", "C:\\Users\\EvansMbongo\\Desktop\\Tests\\SeleniumAssignment\\src\\test\\Utils");

        // Sets the mime types for which Firefox will never ask what to do with a file of this type and will save it to disk.
        // Here, 'application/pdf' tells Firefox to automatically download PDF files without asking.
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");

        // Applies the profile settings to FirefoxOptions. This step is crucial for the preferences to take effect.
        options.setProfile(profile);

        // Creates a new instance of FirefoxDriver with the specified options. This starts a new Firefox browser with the given profile settings.
        this.driver = new FirefoxDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/");
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
