import util.DateParser;
import util.DecimalParser;
import util.HtmlParser;

public class App {

    public static void main(String[] args) {

        new HtmlParser().showDollarRate();
        new DateParser().showParsedDates();
        new DateParser().showParsedLocalDate();
        new DecimalParser().showParsedNumbers();
    }
}
