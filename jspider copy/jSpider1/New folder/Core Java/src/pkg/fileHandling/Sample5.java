package pkg.fileHandling;
import java.io.File;
public class Sample5 {
	public static void main(String[] args) {
		File f1 = new File("D://Goal 2025//24-25//IT//1. Programming//Java//jSpider//eclipse//Core Java//File Handling");
		if(f1.delete()) {
			System.out.println("Yes, Folder is deleted");
		}
		else {
			System.out.println("No, Folder is not deleted");
		}
	}
}
