import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalendarPage {
    WebDriver driver;
    public CalendarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Calendars")
    private WebElement calendarBtn;
    @FindBy(id = "g1065-selectorenteradate")
    private WebElement datePicker;
    @FindBy(css = "div[class='entry-content'] button[type='submit']")
    private WebElement submitBtn;
    @FindBy(id = "contact-form-success-header")
    private WebElement successMessage;
    @FindBy(css = ".breadcrumb_last")
    private WebElement anywhere;


    public void clickCalendarBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calendarBtn);
        calendarBtn.click();
    }
    public void selectDate(String date){
        datePicker.sendKeys(date);
    }
    public void clickSubmitBtn(){
        // Waiting for element to be clickable before submit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        submitBtn.click();
    }
    public String getSuccessText(){
        return successMessage.getText();
    }
    public void clickAnywhere() {
        anywhere.click();
    }
}
