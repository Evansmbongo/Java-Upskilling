import dataProvider.SliderData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest{
    @Test(dataProvider = "sliderData", dataProviderClass = SliderData.class)
    public void testSlider(int x, int y) {
        Sliders slider = new Sliders(driver);
        slider.clickSliderBtn();
        slider.dragSlideMe(x, y);
        Assert.assertEquals(slider.getValue(), 50, "Slider value does not match");


    }
}
