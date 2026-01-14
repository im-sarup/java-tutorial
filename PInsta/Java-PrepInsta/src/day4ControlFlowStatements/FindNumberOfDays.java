// Question: Find the number of days in a month. Write a program that prompts the user to enter the month and year,
// and displays the number of days in that month.
// Example:
//   Input: month = 2, year = 2012 → February 2012 has 29 days
//   Input: month = 3, year = 2015 → March 2015 has 31 days

package day4ControlFlowStatements;

import java.util.Scanner;

public class FindNumberOfDays {

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void getDaysInMonth(int month, int year) {

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("-1");
            return;
        }

        // Validate year
        if (year < 1 || year > 9999) {
            System.out.println("-1");
            return;
        }

        switch (month) {
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                System.out.println("February " + year + " has " +
                        (isLeapYear(year) ? "29 days" : "28 days"));
                break;
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1–12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year (1–9999): ");
        int year = sc.nextInt();

        getDaysInMonth(month, year);
    }
}
