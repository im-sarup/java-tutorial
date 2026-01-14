package day4ControlFlowStatements;

public class SwitchCase {
    public static void main(String[] args) {

        // Case 1: If-else example
        /*
        int myValue = 2;

        if (myValue == 1) {
            System.out.println("Value is 1");
        } else if (myValue == 2) {
            System.out.println("Value is 2");
        } else if (myValue == 3) {
            System.out.println("Value is 3");
        }
        */

        // Case 2: Switch case with integer value
        /*
        int mySwitchValue = 2;
        switch (mySwitchValue) {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                System.out.println("Calculated value: " + (5 * mySwitchValue));
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 4: case 5: case 6: case 7:
                System.out.println("The value is between 4 and 7");
                break;
            default:
                System.out.println("Default value is 0");
                break;
        }
        */

        // Case 3: Switch case with char data
        /*
        char myCharValue = 'D';
        switch (myCharValue) {
            case 'A':
                System.out.println("The value is A");
                break;
            case 'B':
                System.out.println("The value is B");
                break;
            case 'C':
                System.out.println("The value is C");
                break;
            default:
                System.out.println("Value not found");
        }
        */

        // Case 4: Switch case with String data
        String dayOfWeek = "SunDay";

        switch (dayOfWeek.toLowerCase()) {
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            case "monday":
                System.out.println("Today is Monday");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday");
                break;
            default:
                System.out.println("Today is a Holiday");
        }
    }
}
