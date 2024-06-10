package dataProvider;

import org.testng.annotations.DataProvider;
public class PopUpData {
    @DataProvider(name = "promptData")

    public Object[][] promptData() {
        return new Object[][]{
                {
                "Evans Mbongo"
                }
        };
    }
}
