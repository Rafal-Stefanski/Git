package pro2.chuckNorissJokes;

import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Show10Jokes {

    public static void main(String[] args) throws IOException {
        URL chucknorris = new URL("https://api.chucknorris.io/jokes/random");
        URLConnection connection = chucknorris.openConnection();
        connection.addRequestProperty("User-Agent", "Firefox");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

        GsonBuilder Gson = new GsonBuilder();
        Gson.setPrettyPrinting();


//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setPrettyPrinting();
//        Gson gson = gsonBuilder.create();


    }
}
