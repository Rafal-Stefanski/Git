package pro2.chuckNorissJokes.solution;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            String jokeValue = downloadNewJoke();
            System.out.println("Treść żartu: " + jokeValue);
        }
    }

    private static String downloadNewJoke() throws IOException {
        String link = "https://api.chucknorris.io/jokes/random";

        URL url = new URL(link);

        URLConnection conn = url.openConnection();
        conn.setRequestProperty("User-Agent", "Chrome");
        InputStream inputStream = conn.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        //System.out.println(line);

        Gson gson = new Gson();

        Joke joke = gson.fromJson(line, Joke.class);
        return joke.value;
    }
}
