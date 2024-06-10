import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import dataProvider.CalendarData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CalendarTest extends BaseTest{
    @Test(dataProvider = "dateData", dataProviderClass = CalendarData.class)
    public void testCalendar(String date) {
        CalendarPage calendarPage = new CalendarPage();
        calendarPage.calendarBtn();
        calendarPage.selectDate(date);
        calendarPage.clickAnywhere();
        calendarPage.submitBtn();
        Assert.assertEquals(calendarPage.getSuccessText(), "Your message has been sent", "Message does not match");

    }
}
