package ir.alishayanpoor;

import java.util.Locale;

public class NumberSeparatorHelper {
    public static String thousandSeparate(String number) {
        // remove unnecessary zeros and check if string is number --
        try {
            Double d = Double.parseDouble(number);
            if (d % 1 != 0) {
                // has decimal part
                number = String.format(Locale.ENGLISH, "%.3f", d);
            } else {
                number = String.format(Locale.ENGLISH, "%.0f", d);
            }
        } catch (Exception e) {
            return "";
        }
        // split decimal and integer --------------------------------
        String integerPart = "";
        String decimalPart = "";
        if (number.contains(".")) {
            integerPart = number.split("\\.")[0];
            decimalPart = number.split("\\.")[1];
        } else {
            integerPart = number;
        }
        if (integerPart.equals("0")) {
            return formatCheckNumber(integerPart, decimalPart);
        }
        // thousand separate integers -------------------------------
        char[] charArray = integerPart.toCharArray();
        StringBuilder integerPartBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            integerPartBuilder.append(c);
            if ((charArray.length - 1 - i) % 3 == 0 && i + 1 < charArray.length) {
                integerPartBuilder.append(",");
            }
        }
        integerPart = integerPartBuilder.toString();
        // finally add decimal part to it ---------------------------
        return formatCheckNumber(integerPart, decimalPart);
    }

    private static String formatCheckNumber(String integerPart, String decimalPart) {
        if (decimalPart.equals("0") || decimalPart.isEmpty()) {
            return integerPart;
        }
        return integerPart + "." + decimalPart;
    }
}
