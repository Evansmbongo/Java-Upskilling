import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Tables {
    WebDriver driver;
    WebDriverWait wait;

    public Tables(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//a[normalize-space()='Tables']")
    private WebElement tablesBtn;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    private WebElement searchField;

    @FindBy(xpath = "//th")
    private List<WebElement> columns;

    @FindBy(css = "table[id='tablepress-1'] tbody tr")
    private List<WebElement> tableRows;

    public void clickTablesBtn() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tablesBtn);
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(tablesBtn));
        tablesBtn.click();

    }

    public void setSearchField(String country) {
        searchField.sendKeys(country);
    }

    public String iterateTable() {
        int rows = tableRows.size();
        int cols = columns.size();
        String price = null;

        for (int i = 0; i < rows; i++) {
            List<WebElement> cells = tableRows.get(i).findElements(By.cssSelector("td"));

            for (int j = 0; j < cols; j++) {
                String data = cells.get(j).getText(); //get the table data

                if (data.equals("Brazil")) {
                    price = cells.get(2).getText(); // price is in the third column
                    System.out.println("Found Brazil with price: " + price);
                    break; // Exit the inner loop once Brazil is found
                }
            }
        }
        return price;
    }
}
