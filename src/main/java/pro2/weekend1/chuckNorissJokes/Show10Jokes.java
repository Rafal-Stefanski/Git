package pro2.weekend1.chuckNorissJokes;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Show10Jokes {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            String jokeValue = downloadNewJoke();
            System.out.println("Joke: " + jokeValue);
        }
    }

    private static String downloadNewJoke() throws IOException {
        String link = "https://api.chucknorris.io/jokes/random";

        URL url = new URL(link);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Firefox");
        InputStream inputStream = connection.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
//        System.out.println(line);

        Gson gson = new Gson();
        GsonJoke joke = gson.fromJson(line, GsonJoke.class);

        return joke.value;
    }

//    public static void main(String[] args) throws IOException {
//        URL chucknorris = new URL("https://api.chucknorris.io/jokes/random");
//        URLConnection connection = chucknorris.openConnection();
//        connection.addRequestProperty("User-Agent", "Firefox");
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(connection.getInputStream()));
//
//        String inputLine;
//        while ((inputLine = in.readLine()) != null)
//            System.out.println(inputLine);
//        in.close();
//
//        GsonBuilder GsonJoke = new GsonBuilder();
//        GsonJoke.setPrettyPrinting();


//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setPrettyPrinting();
//        GsonJoke gson = gsonBuilder.create();


//    }
}
