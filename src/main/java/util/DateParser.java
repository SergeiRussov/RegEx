package util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateParser {

    private static final SimpleDateFormat RUS_FORMAT = new SimpleDateFormat("dd.MM.YYYY 'at' HH:MM:ss");
    private static final SimpleDateFormat USA_FORMAT = new SimpleDateFormat("MM-dd-YYYY 'at' HH:MM:ss");
    private static final SimpleDateFormat MY_FORMAT = new SimpleDateFormat("YYYY/dd/MM 'at' HH:MM:ss");
    private static final DateTimeFormatter RUS = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public void showParsedDates() {
        System.out.println("date: " + RUS_FORMAT.format(new Date()));
        System.out.println("date: " + USA_FORMAT.format(new Date()));
        System.out.println("date: " + MY_FORMAT.format(new Date()));
    }

    public void showParsedLocalDate() {
        System.out.println("parsed date: " + RUS.format(LocalDate.now()));
    }
}
