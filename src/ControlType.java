public class ControlType {

    public static boolean isNumeric(String str) {
        return str.replaceAll("\\D+","").length() != str.length();
    }

    public static void checkNumbers(String str1, String str2) {
       if(isNumeric(str1) != isNumeric(str2))
           throw new IllegalArgumentException("Different operands.");
    }
}
