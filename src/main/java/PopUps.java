import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.switchTo;

public class PopUps {
    @FindBy(xpath = "//a[normalize-space()='Popups']")
    private SelenideElement popUpsBtn;

    @FindBy(id = "alert")
    private SelenideElement alertBtn;

    @FindBy(id = "confirm")
    private SelenideElement confirmBtn;

    @FindBy(id = "prompt")
    private SelenideElement promptBtn;

    public void clickPopUpsBtn() {
        popUpsBtn.click();
    }
    public void clickAlertBtn() {
        alertBtn.click();
    }
    public String getAlertText() {
        return switchTo().alert().getText();
    }
    public void acceptAlert() {
        switchTo().alert().accept();
    }
    public void clickConfirmBtn() {
        confirmBtn.click();
    }
    public String getConfirmText() {
        return switchTo().alert().getText();
    }
    public void confirm() {
        switchTo().alert().accept();
    }
    public void clickPromptBtn() {
        promptBtn.click();
    }
    public String getPromptText() {
        return switchTo().alert().getText();
    }
    public void setPromptText(String text) {
        switchTo().alert().sendKeys(text);
    }
    public void acceptPrompt() {
        switchTo().alert().accept();
    }
}
