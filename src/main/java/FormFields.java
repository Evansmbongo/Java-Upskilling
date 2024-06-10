import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.switchTo;

public class FormFields {
// Declaring element variables
    @FindBy(xpath = "//a[normalize-space()='Form Fields']")
    private SelenideElement formFieldsBtn;
    @FindBy(id = "name")
    private SelenideElement nameField;
    @FindBy(css = "input[value='Water']")
    private SelenideElement waterCheckbox;
    @FindBy(css = "label[for='color1']")
    private SelenideElement redRadioButton;
    @FindBy(id = "siblings")
    private SelenideElement siblingsField;
    @FindBy(id = "email")
    private SelenideElement emailField;
    @FindBy(id = "message")
    private SelenideElement messageField;
    @FindBy (css = "button[id='submit-btn']")
    private SelenideElement submitBtn;

    public void formFieldsBtn(){
        formFieldsBtn.click();
    }
    public void name(String name) {
        nameField.sendKeys(name);
    }
    public void waterCheckbox() {
        waterCheckbox.click();
    }
    public void redRadioButton() {
        redRadioButton.click();
    }
    public void siblings() {
        siblingsField.selectOption("Yes");
    }
    public void email(String email) {
        emailField.setValue(email);
    }
    public void message(String message) {
        messageField.setValue(message);
    }
    public void clickSubmitBtn() {
        submitBtn.click();
    }
    public String getAlertText() {
        return switchTo().alert().getText();
    }
    public void acceptAlert() { switchTo().alert().accept();
    }
}
