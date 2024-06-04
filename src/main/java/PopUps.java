import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopUps {
    WebDriver driver;
    public PopUps(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Popups']")
    private WebElement popUpsBtn;

    @FindBy(id = "alert")
    private WebElement alertBtn;

    @FindBy(id = "confirm")
    private WebElement confirmBtn;

    @FindBy(id = "prompt")
    private WebElement promptBtn;

    public void clickPopUpsBtn() {
        popUpsBtn.click();
    }
    public void clickAlertBtn() {
        alertBtn.click();
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public void clickConfirmBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn));
        confirmBtn.click();
    }
    public String getConfirmText() {
        return driver.switchTo().alert().getText();
    }
    public void confirm() {
        driver.switchTo().alert().accept();
    }
    public void clickPromptBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(promptBtn));
        promptBtn.click();
    }
    public String getPromptText() {
        return driver.switchTo().alert().getText();
    }
    public void setPromptText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    public void acceptPrompt() {
        driver.switchTo().alert().accept();
    }
}
