import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class ParameterizedTest1 {
    @Test
    @Parameters({"myName","id","time","isFemale"})
    public void parameterTest(String myName,int id,long time,boolean isFemale) {

        System.out.println("myName:" + myName);
        System.out.println("id:" + id);
        System.out.println("time:" + time);
        System.out.println("isFemale:"+isFemale);
    }
}
