import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Modals {
    WebDriver driver;
    public Modals(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Modals")
    private WebElement modalsBtn;
    @FindBy(css = "#simpleModal")
    private WebElement simpleModal;
    @FindBy(css = "div[id='popmake-1318'] p")
    private WebElement simpleModalText;
    @FindBy(css = "div[id='popmake-1318'] button")
    private WebElement simpleModalCloseBtn;

    @FindBy(id = "formModal")
    private WebElement formModal;
    @FindBy(id = "g1051-name")
    private WebElement nameField;
    @FindBy(id = "contact-form-comment-g1051-message")
    private WebElement emailField;
    @FindBy(id = "contact-form-comment-g1051-message")
    private WebElement messageField;
    @FindBy(className = "pushbutton-wide")
    private WebElement formModalSubmitBtn;

    public void clickModalsBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", modalsBtn);
        modalsBtn.click();
    }
    public void clickSimpleModalBtn(){
        simpleModal.click();
    }
    public String getSimpleModalText(){
        return simpleModalText.getText();
    }
    public void clickSimpleModalCloseBtn(){
        simpleModalCloseBtn.click();
    }

    public void clickFormModalBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(formModal));
        formModal.click();
    }

    public void setFormModal(String name, String email, String message) {
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        messageField.sendKeys(message);
    }
    public void clickFormModalSubmitBtn(){
        formModalSubmitBtn.click();
    }
}
