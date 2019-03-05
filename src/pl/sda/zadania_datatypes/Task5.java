package pl.sda.zadania_datatypes;

// 5. Wyświetl na ekranie pięć pierwszych liter alfabetu: łacińskiego (zaczyna się od kodu: 65), hebrajskiego (zaczyna się
// od: 1488) i tybetańskiego (zaczyna się od: 3840)

public class Task5 {
    public static void main(String[] args) {

        //Latin charachters
        System.out.println("First 5 letter from latin alphabet: " + (char) 65 + ',' + (char) 66 + ',' + (char) 67 + ',' + (char) 68 + ',' + (char) 69 + '.' );
        //hebrew charachters
        System.out.println("First 5 letter from hebrew alphabet: " + (char) 1488 + ',' + (char) 1489 + ',' + (char) 1490 + ',' + (char) 1491 + ',' + (char) 1492 + '.' );
        //tibetan charachters
        System.out.println("First 5 letter from tibetan alphabet: " + (char) 3840 + ',' + (char) 3841 + ',' + (char) 3842 + ',' + (char) 3843 + ',' + (char) 3844 + '.' );

    }
}
