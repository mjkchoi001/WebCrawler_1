import org.jsoup.Connection;
import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.ArrayList;

public class Crawler_functions {

    public static void crawl(int Level, String URL, ArrayList<String> Visitation){
        /* Level = # of layers of websites
        URL = URL of the website that we are trying to visit
        Visitation = To keep the history of the websites that were visited.
         */

        if(Level <= 3){
            Document doc = request(URL, Visitation);

            if(doc != null){
                for(Element link : doc.select("a[href]")){
                    String next_link = link.absUrl("href");
                    if(!Visitation.contains(next_link));
                    {
                        crawl(Level + 1, next_link, Visitation);
                    }
                }
            }

        }

    }

    public static Document request(String URL, ArrayList<String> ArrList){
        try {
            Connection con = Jsoup.connect(URL);
            Document doc = con.get();

            if (con.response().statusCode() == 200) ;
            // 200 means that it is OK to visit the website
            {
                System.out.println("Link: " + URL);
                System.out.println(doc.title());
                ArrList.add(URL);

                return doc;
            }

        }

        catch(IOException e){
            return null;
        }
    }

}

