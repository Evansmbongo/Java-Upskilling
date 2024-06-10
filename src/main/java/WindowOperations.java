import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WindowOperations {
    @FindBy(linkText = "Window Operations")
    private SelenideElement windowOperationsBtn;
    @FindBy(css ="button[onclick='newTab()'] b")
    private SelenideElement newTabBtn;
    @FindBy(css = "button[onclick='newWindow()']")
    private SelenideElement newWindowBtn;
    @FindBy(css = "button[onclick='newWindowSelf()']")
    private SelenideElement replaceWindowBtn;

    public void clickWindowOpeartionsBtn() {
        windowOperationsBtn.click();
    }
    public void clickNewTabBtn() {
        newTabBtn.click();
        String mainWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        Set<String> allWindows = WebDriverRunner.getWebDriver().getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(window);
                break;
            }
        }
        Selenide.sleep(2000);
    }
    public void clickNewWindowBtn() {
        String mainWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        Set<String> allWindows = WebDriverRunner.getWebDriver().getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(window);
                break;
            }
        }
        newWindowBtn.click();
    }
    public void clickReplaceWindowBtn() {
        replaceWindowBtn.click();
    }
}
