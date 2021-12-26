package ir.alishayanpoor;

import java.text.DecimalFormat;
import java.util.Locale;

public class NumberSeparatorWithFormatHelper {
    public static String thousandSeparateWithFormat(String number) {
        DecimalFormat decimalFormat = new DecimalFormat(
                "#,###,###,###,###,###,###,###,###,###,###,###,###,###.##########"
        );
        try {
            double dNumber = Double.parseDouble(number);
            return decimalFormat.format(dNumber);
        } catch (Exception e) {
            return "";
        }
    }
}
