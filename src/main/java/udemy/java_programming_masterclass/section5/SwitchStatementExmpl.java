package udemy.java_programming_masterclass.section5;

public class SwitchStatementExmpl {
    public static void main(String[] args) {
        int switchvalue = 1;
        switch (switchvalue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3 or a 4, or a 5");
                System.out.println("Actualy it was a " + switchvalue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char letterValue = 'E';
        switch (letterValue) {
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Letter is " + letterValue);
                break;
            default:
                System.out.println("Not found any of letters A, B, C, D or E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("It's January!");
                break;
            case "june":
                System.out.println("It's June!");
                break;
            default:
                System.out.println("Not sure..");
                break;
        }
        System.out.println("\n=== Challenge === using switch/case");
        printDayOfTheWeek(5);
        System.out.println("\n=== Challenge ===  using if/else");
        printDayOfTheWeek("Friday");

    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(day + "? There is no such a day.");

        }
    }

    public static void printDayOfTheWeek(String day) {
        if (day.toLowerCase().equals("monday")) {
            System.out.println(day + " is day no 1");
        } else if (day.toLowerCase().equals("tuesday")) {
            System.out.println(day + " is day no 2");
        } else if (day.toLowerCase().equals("wednesday")) {
            System.out.println(day + " is day no 3");
        } else if (day.toLowerCase().equals("thursday")) {
            System.out.println(day + " is day no 4");
        } else if (day.toLowerCase().equals("friday")) {
            System.out.println(day + " is day no 5");
        } else if (day.toLowerCase().equals("saturday")) {
            System.out.println(day + " is day no 6");
        } else if (day.toLowerCase().equals("sunday")) {
            System.out.println(day + " is day no 7");
        } else {
            System.out.println(day + "Is there some mistake in spelling?");
        }
    }

}
