package util;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class HtmlParser {

    private static final String LINK = "https://www.cbr.ru/currency_base/daily/";

    private String text;

    public void showDollarRate() {
        try {
            text = Jsoup.connect(LINK).get().text();
        } catch (IOException e) {
            log.error(e.getMessage());
        }

        Pattern pattern = Pattern.compile("USD\\s\\d\\sДоллар США\\s\\d{2},\\d{4}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("rate: " + matcher.group().replaceAll("USD\\s\\d\\sДоллар США\\s", ""));
        }
    }
}
