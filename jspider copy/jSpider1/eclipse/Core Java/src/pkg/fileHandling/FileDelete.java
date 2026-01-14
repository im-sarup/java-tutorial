package pkg.fileHandling;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File f1 = new File("D://Goal 2025//24-25//IT//1. Programming//Java//jSpider//eclipse//Core Java//bin//pkg//fileHandling//Java420//Java420.txt");
		
		if(f1.delete()) {
			System.out.println("Yes, File is deleted successfully");
		}
		else {
			System.out.println("No, File is not deleted");
		}

	}

}
