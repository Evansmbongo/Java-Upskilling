import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sliders {
    WebDriver driver;
    WebDriverWait wait;

    public Sliders(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='wp-block-button has-custom-width wp-block-button__width-50 is-style-shadow'])[2]")
    private WebElement slidersBtn;

    @FindBy(id = "slideMe")
    private WebElement slideMe;

    @FindBy(id = "value")
    private WebElement sliderValue;

    public void clickSliderBtn() {
        // Scroll the element into view using JavaScript and click the button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slidersBtn);
        wait.until(ExpectedConditions.elementToBeClickable(slidersBtn));
        slidersBtn.click();
    }
    public void dragSlideMe(int xoffset, int yoffset) {
        // Sliding the element
        Actions action = new Actions(driver);
        action.dragAndDropBy(slideMe, xoffset, yoffset).perform();
    }

    public int getValue() {
    // Getting the value of the slider and converting it to integer
        String valueText = sliderValue.getText();
        return Integer.parseInt(valueText);
    }
}
