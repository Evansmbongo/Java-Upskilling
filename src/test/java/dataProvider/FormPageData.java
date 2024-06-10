package dataProvider;

import org.testng.annotations.DataProvider;

public class FormPageData {
    @DataProvider(name = "formFieldData")
    public Object[][] formFieldData() {
        return new Object[][]{
                {
                "Evans Mbongo",
                "evans.mbongo@amalitech.com",
                "Oh dear"
                }

        };
    }

}
