package pkg.fileHandling;
import java.io.File;

public class Sample {
    public static void main(String[] args) {
        File f1 = new File("D://Goal 2025//24-25//IT//1. Programming//Java//jSpider//eclipse//Core Java//File Handling");
        if (f1.mkdir()) {
            System.out.println("Yes, Folder is created");
        } else {
            System.out.println("No, Folder is not created");
        }
    }
}

