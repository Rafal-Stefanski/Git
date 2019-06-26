package pro2.weekend1.currencyExchangeRate;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {

    }

    private static String downloadExchangeRates() throws IOException {
        String link = "http://api.nbp.pl/api/exchangerates/tables/";

        URL url = new URL(link);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("User-Agent", "Chrome");
        InputStream inputStream = connect.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();

        Gson gson = new Gson();

//        NBP nbp = gson.fromJson(value, NBP.class);

        return null;
    }
}
