import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class ParamTestWithDataProvider1 {
    private PrimeNumberChecker primeNumberChecker;
    @BeforeMethod
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }
    @DataProvider(name = "data1")
    public static Object[][] primeNumbers() {
        return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }
    @Test(dataProvider = "data1")
    public void testPrimeNumberChecker(Integer inputNumber,Boolean isExpectedResult){
        System.out.println(inputNumber + " " + isExpectedResult);
        Assert.assertEquals(isExpectedResult, primeNumberChecker.validate(inputNumber));
    }

}
