import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlType {

    public static boolean isNumeric(String str)
    {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(str);
        String result = m.group();
        if(result.length() != str.length()) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void checkNumbers(String str1, String str2)
    {
       if(isNumeric(str1) != isNumeric(str2))
           throw new IllegalArgumentException("Different operands.");
    }
}
