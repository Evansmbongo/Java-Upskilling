import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeMethod
    public void openPage(){
        Configuration.browser = "firefox";
        open ("https://practice-automation.com/");
        Configuration.timeout = 5000;
    }
}
