package dataProvider;

import org.testng.annotations.DataProvider;

public class ModalFormData {
    @DataProvider(name = "modalForm")
    public Object[][] modalForm(){
        return new Object[][]{
                {
                    "Evans Mbongo","luckyevance3@gmail.com","Oh dear!"
                }
        };
    }
}
