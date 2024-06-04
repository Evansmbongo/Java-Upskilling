import dataProvider.CalendarData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class CalendarTest extends BaseTest {
    @Test(dataProvider = "dateData", dataProviderClass = CalendarData.class)
    public void testCalendar(String date) throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage(driver);
        calendarPage.clickCalendarBtn();
        calendarPage.selectDate(date);
        calendarPage.clickAnywhere();
//        Thread.sleep(3000);
        calendarPage.clickSubmitBtn();
//        Assert.assertEquals(calendarPage.getSuccessText(), "Your message has been sent", "Message does not match");

    }
}
