import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WindowOperations {
    WebDriver driver;
    public WindowOperations(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Window Operations")
    private WebElement windowOperationsBtn;
    @FindBy(css ="button[onclick='newTab()'] b")
    private WebElement newTabBtn;
    @FindBy(css = "button[onclick='newWindow()']")
    private WebElement newWindowBtn;
    @FindBy(css = "button[onclick='newWindowSelf()']")
    private WebElement replaceWindowBtn;

    public void clickWindowOpeartionsBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", windowOperationsBtn);
        wait.until(ExpectedConditions.elementToBeClickable(windowOperationsBtn));
        windowOperationsBtn.click();
    }
    public void clickNewTabBtn() {
        newTabBtn.click();
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://automatenow.io/"));
    }
    public void clickNewWindowBtn() {
        newWindowBtn.click();
        driver.getWindowHandles().forEach(window -> driver.switchTo().window(window));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://automatenow.io/"));
    }
    public void clickReplaceWindowBtn() {
        replaceWindowBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://automatenow.io/"));
    }
}
