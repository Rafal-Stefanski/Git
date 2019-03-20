package pl.sda.zadania_datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class Calendar {

    public static void main(String[] args) {
        birthdayDate();
    }

    private static void birthdayDate() {
        LocalDate localDateParse = LocalDate.parse("1980-03-02"+"at:"+"9:00AM");
        System.out.println("My birthday: " + localDateParse);
    }
}
