package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class CalendarData {
    @DataProvider(name = "dateData")
    public Object[][] dateData() {
        return new Object[][]{
                {
                    "2024-05-18"
                }
        };
    }
}
