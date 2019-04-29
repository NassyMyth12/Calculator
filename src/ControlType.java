public class ControlType {

    public static boolean isNumeric(String str)
    {
        try {
            int i = Integer.parseInt(str);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void CheckNumbers(String str1, String str2)
    {
       if(isNumeric(str1) != isNumeric(str2))
           throw new IllegalArgumentException("Different operands.");
    }
}
