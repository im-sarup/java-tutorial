package day4ControlFlowStatements;

public class IfThen1 {
    public static void main(String[] args) {

        // Grade criteria:
        // 100        - S
        // 91 to 99   - A
        // 81 to 90   - B
        // 71 to 80   - C

        int marks = 85;

        if (marks == 100) {
            System.out.println("S");
        }
        else if (marks >= 91 && marks <= 99) {
            System.out.println("A");
        }
        else if (marks >= 81 && marks <= 90) {
            System.out.println("B");
        }
        else if (marks >= 71 && marks <= 80) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}