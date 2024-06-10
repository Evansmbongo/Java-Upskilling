import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CalendarPage {
    public void calendarBtn(){
        SelenideElement btn = $(By.linkText("Calendars"));
        btn.click();
    }
    public void selectDate(String date){
        SelenideElement datePicker = $(By.id("g1065-selectorenteradate"));
        datePicker.setValue(date);
    }
    public void submitBtn(){
        SelenideElement subBtn = $(By.cssSelector("div[class='entry-content'] button[type='submit']"));
        subBtn.click();
    }
    public String getSuccessText(){
        return $(By.id("contact-form-success-header")).text();
    }
    public void clickAnywhere() {
        $(By.cssSelector(".breadcrumb_last")).click();
    }
}
