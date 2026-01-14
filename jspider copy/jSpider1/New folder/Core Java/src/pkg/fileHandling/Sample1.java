package pkg.fileHandling;
import java.io.File;
import java.io.IOException;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D://Goal 2025//24-25//IT//1. Programming//Java//jSpider//eclipse//Core Java//File Handling//File.txt");
		if(f1.createNewFile()) {
			System.out.println("Yes, File is created");
		}
		else {
			System.out.println("No, File is not created");
		}
	}
}
