package dataProvider;

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
