public class CheckDigits {
    /**
     * @ isAllDigits - To find where is all characters are digits in a string
     * @ str - the string
     * @ return - returning true or false value, where is all are digits
     **/
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}



