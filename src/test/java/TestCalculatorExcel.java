import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.read.biff.BiffException;

public class TestCalculatorExcel {

    Calculator cal=new Calculator();

    @DataProvider(name="num")
    public Object[][] Numbers() throws BiffException, IOException{
        ExcelData e=new ExcelData("testdata", "calculator");
        return e.getExcelData();

    }
    @Test(dataProvider="num")
    public void testAdd(HashMap<String, String> data){
        System.out.println(data.toString());
        float num1=Float.parseFloat(data.get("num1"));
        float num2=Float.parseFloat(data.get("num2"));
        float expectedResult=Float.parseFloat(data.get("result"));
        Float actual=cal.add(num1, num2);
        Assert.assertEquals(actual, expectedResult);
    }
}
