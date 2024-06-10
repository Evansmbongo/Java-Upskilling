import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class TablesTest extends BaseTest{
    @Test
    public void testTable() throws Exception{
        Tables tables = page(Tables.class);
        tables.clickTablesBtn();
        tables.setSearchField("b");
        tables.iterateTable();
        Assert.assertEquals(tables.iterateTable(), "216.4", "Price does not match");
    }
}
