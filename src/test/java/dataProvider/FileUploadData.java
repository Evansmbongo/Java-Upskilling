package dataProvider;

import org.testng.annotations.DataProvider;

public class FileUploadData {
    @DataProvider(name = "filePath")
    public Object[][] filePath(){
        return new Object[][]{
                {
                        "C:\\Users\\EvansMbongo\\Desktop\\Tests\\SeleniumAssignment\\src\\main\\resources\\images.jpeg"
                }
        };
    }
}
