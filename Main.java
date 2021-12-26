package ir.alishayanpoor;

import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String number = "123000000";
        // with first helper
        System.out.println(NumberSeparatorWithFormatHelper
                .thousandSeparateWithFormat(number));
        // with second helper
        System.out.println(NumberSeparatorHelper
                .thousandSeparate(number));
    }
}
