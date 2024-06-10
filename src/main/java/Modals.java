import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Modals {
    @FindBy(linkText = "Modals")
    private SelenideElement modalsBtn;
    @FindBy(css = "#simpleModal")
    private SelenideElement simpleModal;
    @FindBy(css = "div[id='popmake-1318'] p")
    private SelenideElement simpleModalText;
    @FindBy(css = "div[id='popmake-1318'] button")
    private SelenideElement simpleModalCloseBtn;

    @FindBy(id = "formModal")
    private SelenideElement formModal;
    @FindBy(id = "g1051-name")
    private SelenideElement nameField;
    @FindBy(id = "contact-form-comment-g1051-message")
    private SelenideElement emailField;
    @FindBy(id = "contact-form-comment-g1051-message")
    private SelenideElement messageField;
    @FindBy(className = "pushbutton-wide")
    private SelenideElement formModalSubmitBtn;

    public void clickModalsBtn(){
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
        formModal.click();
    }

    public void setFormModal(String name, String email, String message) {
        nameField.setValue(name);
        emailField.setValue(email);
        messageField.setValue(message);
    }
    public void clickFormModalSubmitBtn(){
        formModalSubmitBtn.click();
    }
}
