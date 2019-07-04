package pro2.weekend1.currencyExchangeRate;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) throws IOException {
        
        NBP currencyValue = downloadExchangeRate();

        System.out.println("currency mid rate for today is: " + currencyValue);


    }
    

    private static NBP downloadExchangeRate() throws IOException {
//        String link = "http://api.nbp.pl/api/exchangerates/tables/a/?format=json/"; // wszystkie
        String link = "http://api.nbp.pl/api/exchangerates/rates/a/usd//?format=json/"; //USD


        URL url = new URL(link);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Firefox");
        InputStream inputStream = connection.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
//        System.out.println(line);

        Gson gson = new Gson();
        NBP courency = gson.fromJson(line, NBP.class);

        return courency;
    }

}
