import org.testng.Assert;
import org.testng.annotations.Test;

public class TablesTest extends BaseTest{
    @Test
    public void testTable() throws Exception{
        Tables tables = new Tables(driver);
        tables.clickTablesBtn();
        tables.setSearchField("b");
        Thread.sleep(2000);
        tables.iterateTable();
        Assert.assertEquals(tables.iterateTable(), "216.4", "Price does not match");
    }
}
