import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestValidateUserInfWIthDataProvider {
    @DataProvider(name = "test1")
    public static Object[][] users() {
        return new Object[][] {
                { new User("cssrrr",11,"anoorshan@163.com", "15216610825"),true },
                { new User("css12366#",11,"anoorshan@163.com", "15216610825"),false },
                { new User("css1",11,"anoorshan@163.com", "15216610825"),false }};
    }
    @Test(dataProvider = "test1")
    public void testMethod( User user, Boolean isValid) {
        Boolean flg = ValidateUserInf.validateUserName(user.getUserName());
        Assert.assertEquals(isValid,flg,user.getUserName()+" fail");
    }
}
