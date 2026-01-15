package day4ControlFlowStatements;

public class FindVowel {
    public static void main(String[] args) {

        // Method 1: Switch case with uppercase and lowercase vowels
        /*
        char myLetter = 'A';
        switch (myLetter) {
            case 'a': case 'A':
                System.out.println("This is a vowel");
                break;
            case 'e': case 'E':
                System.out.println("This is a vowel");
                break;
            case 'i': case 'I':
                System.out.println("This is a vowel");
                break;
            case 'o': case 'O':
                System.out.println("This is a vowel");
                break;
            case 'u': case 'U':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is a consonant");
                break;
        }
        */

        // Method 2: Converting character to lowercase for cleaner logic
        char myLetter = 'A';

        switch (Character.toLowerCase(myLetter)) {
            case 'a':
                System.out.println("This is a vowel");
                break;
            case 'e':
                System.out.println("This is a vowel");
                break;
            case 'i':
                System.out.println("This is a vowel");
                break;
            case 'o':
                System.out.println("This is a vowel");
                break;
            case 'u':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is a consonant");
                break;
        }
    }
}
