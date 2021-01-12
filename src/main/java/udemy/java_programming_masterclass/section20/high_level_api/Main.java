package udemy.java_programming_masterclass.section20.high_level_api;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
//            URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
            URI baseUri = new URI("db://username:password@myserver.com:5000");
            URI uri = new URI("/catalogue/phones?os=android#samsung");
            URI resolvedUri = baseUri.resolve(uri);

            URL url = resolvedUri.toURL();
            System.out.println("URL = " + url);

//            URI uri = new URI("hello");


            // checking fragments of URI above.
//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User info = " + uri.getAuthority());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port  = " + uri.getPort());
//            System.out.println("Query  = " + uri.getQuery());
//            System.out.println("Fragment  = " + uri.getFragment());


        } catch (URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        }

    }
}
