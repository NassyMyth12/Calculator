public class ControlType {

    public static boolean isNumeric(String str) {
        String result = str.replaceAll("\\D+","");
        if(result.length() != str.length()) {
            return false;
        } else {
            return true;
        }
    }

    public static void checkNumbers(String str1, String str2) {
       if(isNumeric(str1) != isNumeric(str2))
           throw new IllegalArgumentException("Different operands.");
    }
}
