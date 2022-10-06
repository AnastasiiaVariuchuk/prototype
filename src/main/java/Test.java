import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    private final static Logger logger = LogManager.getLogger(Test.class);
    public static void getTest() {
        Document doc;

        {
            try {
                doc = Jsoup.connect("https://www.wikipedia.org/")
                        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36 Edg/106.0.1370.34")
                        .referrer("http://www.google.com")
                        .get();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Elements listNews = doc.select("a");
        logger.info(listNews);

        /*for (Element element : listNews.select("a"))
            System.out.println(element.text());*/
    }

}
