import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormFields {
    WebDriver driver;
    public FormFields(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

// Declaring element variables
    @FindBy(xpath = "//a[normalize-space()='Form Fields']")
    private WebElement formFieldsBtn;
    @FindBy(id = "name")
    private WebElement nameField;
    @FindBy(css = "input[value='Water']")
    private WebElement waterCheckbox;
    @FindBy(css = "label[for='color1']")
    private WebElement redRadioButton;
    @FindBy(id = "siblings")
    private WebElement siblingsField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "message")
    private WebElement messageField;
    @FindBy (css = "button[id='submit-btn']")
    private WebElement submitBtn;

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
        Select select = new Select(siblingsField);
        select.selectByVisibleText("Yes");

    }
    public void email(String email) {
        emailField.sendKeys(email);
    }
    public void message(String message) {
        messageField.sendKeys(message);
    }
    public void clickSubmitBtn() {
        submitBtn.click();
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
