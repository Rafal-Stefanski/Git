package challengerocket.elevators;

public class Main {
    public static void main(String[] args) {
        // solving in main class
        String stringToChange = "some43CamelCase1Na4564me";
        System.out.println((stringToChange.replaceAll("[\\d]", "")).replaceAll("([A-Z])", "-$1").toLowerCase());

        // solving from method - preferred in challenge-rocket
        solve(stringToChange);
    }

    public static String solve(String stringToChange) {
        return stringToChange.replaceAll("[\\d]", "").replaceAll("([A-Z])", "-$1").toLowerCase();
    }
}
