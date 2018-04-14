import org.testng.Assert;
import org.testng.annotations.Test;
public class DependencyTestUsingAnnotation {
    String message = "Manisha";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(dependsOnMethods = { "initEnvironmentTest" })
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "tutorialspoint" + "Manisha";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
    @Test(dependsOnGroups = { "init.*" })
    public void testPrintMessage2() {
        System.out.println("Inside testPrintMessage2()");
        message = "Manisha";
        Assert.assertEquals(message, messageUtil.printMessage());
    }
    @Test(groups = { "init" })
    public void initEnvironmentTest() {
        System.out.println("This is initEnvironmentTest");
    }
    @Test(groups = { "init" })
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "Manisha";
        Assert.assertEquals(message, messageUtil.printMessage());
    }

}
