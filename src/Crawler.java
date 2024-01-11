import java.util.ArrayList;

public class Crawler extends Crawler_functions {

    public static void main(String[] args){
        String URL_1 = "https://en.wikipedia.org/";
        String URL_2 = "https://google.com/";

        crawl(1, URL_2, new ArrayList<String>());

    }



}
