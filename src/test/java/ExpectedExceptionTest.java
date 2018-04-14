import org.testng.Assert;
import org.testng.annotations.Test;
public class ExpectedExceptionTest {
    MessageUtil messageUtil = new MessageUtil();
    @Test(groups = { "functest" },expectedExceptions = ArithmeticException.class)
    public void testFailMessage(){
        System.out.println("Inside testFailMessage()");
        messageUtil.failMessage();
    }

}
