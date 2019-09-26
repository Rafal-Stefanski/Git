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
            case 'C': case 'D': case 'E':
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
    }
}
