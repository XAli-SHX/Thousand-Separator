package ir.alishayanpoor.test;

import ir.alishayanpoor.NumberSeparatorWithFormatHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSeparatorWithFormatHelperTest {

    @Test
    public void ThousandSeparate_BigNumber_SeparateAsNormal() {
        String number = "999999999999";
        String expected = "999,999,999,999";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_VeryBigNumber_SeparateAsNormal() {
        String number = "5300000000000000000000000000000000000";
        String expected = "5,300,000,000,000,000,000,000,000,000,000,000,000";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_Float_SeparateDecimalsAndReturnFloats() {
        String number = "53000.25412";
        String expected = "53,000.25412";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_NotNumber_ReturnExactString() {
        String number = "idsbgfliqgb";
        String expected = "";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_0_Return0() {
        String number = "0";
        String expected = "0";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_1digit_ThousandSeparate() {
        String number = "1";
        String expected = "1";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_2digit_ThousandSeparate() {
        String number = "10";
        String expected = "10";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_3digit_ThousandSeparate() {
        String number = "100";
        String expected = "100";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }


    @Test
    public void ThousandSeparate_4digit_ThousandSeparate() {
        String number = "1230";
        String expected = "1,230";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_5digit_ThousandSeparate() {
        String number = "12300";
        String expected = "12,300";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }


    @Test
    public void ThousandSeparate_6digit_ThousandSeparate() {
        String number = "123000";
        String expected = "123,000";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_7digit_ThousandSeparate() {
        String number = "1230000";
        String expected = "1,230,000";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_8digit_ThousandSeparate() {
        String number = "12300000";
        String expected = "12,300,000";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }

    @Test
    public void ThousandSeparate_ZeroAtFirstOfNumber_SeparateAndRemoveFirstZeros() {
        String number = "00000000012300000";
        String expected = "12,300,000";
        String actual = NumberSeparatorWithFormatHelper.thousandSeparateWithFormat(number);
        assertEquals(expected, actual);
    }
}