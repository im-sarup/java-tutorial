package day4ControlFlowStatements;

public class IfThen {
    public static void main(String[] args) {

        boolean amIAbove18 = true;

        // Checking age eligibility
        if (amIAbove18) {
            System.out.println("You are eligible to vote!");
        }

        if (!amIAbove18) {
            System.out.println("You are not eligible to vote!");
        }

        int a = 10;

        // Case 1: Condition is true, so the statement will be printed
        if (a == 10) {
            System.out.println("A is 10");
        }

        // Case 2: Condition is false, so nothing will be printed
        if (a == 9) {
            System.out.println("A is 9");
        }

        // Case 3: Without braces, only the immediate next line is part of the if-block
        if (a == 10)
            System.out.println("A is 10");
        System.out.println("This is Test");   // This will run regardless of the if condition

        // Case 4: Both lines are inside the if-block, so both will print
        if (a == 10) {
            System.out.println("A is 10");
            System.out.println("This is Test");
        }

        // Case 5: Only the next line is part of the if-block; second line runs independently
        if (a == 9)
            System.out.println("A is 9");
        System.out.println("This is Test");

        // Case 6: Condition is false, so the entire block will not execute
        if (a == 9) {
            System.out.println("A is 9");
            System.out.println("This is Test");
        }

        // Not equal (!=) condition, true so it prints
        if (a != 9) {
            System.out.println("A is not 9");
            System.out.println("This is Test");
        }

        boolean a1 = true;
        // boolean a1 = false;
        if (a1) {
            System.out.println("A1 is true");
            System.out.println("This is Test");
        }

        boolean b1 = false;
        // boolean b1 = true;
        if (!b1) {
            System.out.println("B1 is false");
            System.out.println("This is Demo");
        }
    }
}