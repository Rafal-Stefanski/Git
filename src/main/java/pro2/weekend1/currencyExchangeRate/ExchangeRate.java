package pro2.weekend1.currencyExchangeRate;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) throws IOException {
        String currencyValue = downLoadexchangeRate();
        System.out.println("The currency rate for today is: " + currencyValue);


    }

    private static String downLoadexchangeRate() throws IOException {
//        String link = "http://api.nbp.pl/api/exchangerates/tables/a/?format=json"; // wszystkie
        String link = "http://api.nbp.pl/api/exchangerates/rates/a/chf//?format=json/"; //frank


        URL url = new URL(link);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Firefox");
        InputStream inputStream = connection.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();

        Gson gson = new Gson();
        NBP courency = gson.fromJson(line, NBP.class);

        return courency.value;
    }

//    private static String downloadExchangeRates() throws IOException {
//        String link = "http://api.nbp.pl/api/exchangerates/rates/a/chf//?format=json/"; //frank
//        String link = "http://api.nbp.pl/api/exchangerates/tables/a/?format=json"; // wszystkie
//
//        URL url = new URL(link);
//        URLConnection connect = url.openConnection();
//        connect.addRequestProperty("User-Agent", "Chrome");
//        InputStream inputStream = connect.getInputStream();
//        Scanner scanner = new Scanner(inputStream);
//        String line = scanner.nextLine();
//
//        Gson gson = new Gson();
//
////        NBP nbp = gson.fromJson(value, NBP.class);
//
//        return null;
//    }


}
