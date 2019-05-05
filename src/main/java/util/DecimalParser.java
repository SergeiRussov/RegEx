package util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DecimalParser {

    private static final DecimalFormat FORMAT_ONE = new DecimalFormat("###,###.###");
    private static final DecimalFormat FORMAT_TWO = new DecimalFormat("0000000000.###");
    private Number number = 123456789.123;

    public void showParsedNumbers() {
        System.out.println("number: " + FORMAT_ONE.format(number));
        System.out.println("number: " + FORMAT_TWO.format(number));

        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(';');
        decimalFormatSymbols.setGroupingSeparator(':');

        DecimalFormat decimalFormat = new DecimalFormat("###,###.###", decimalFormatSymbols);
        System.out.println("number: " + decimalFormat.format(number));
    }
}
