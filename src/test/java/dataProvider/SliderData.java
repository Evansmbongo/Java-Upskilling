package dataProvider;

import org.testng.annotations.DataProvider;

public class SliderData {
    @DataProvider(name = "sliderData")
    public Object[][] slidersData() {
        return new Object[][]{
                {0,0}
        };
    }
}
