import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateUserInf {
    private static final String REGEX = "^[a-zA-z][a-zA-z_0-9]{4,15}$";
    static public boolean validateUserName(String userName){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(userName); // 获取 matcher 对象
        return m.matches();//matches是全量匹配方为true
//        return m.find();//find是部分匹配即为true
    }
}
