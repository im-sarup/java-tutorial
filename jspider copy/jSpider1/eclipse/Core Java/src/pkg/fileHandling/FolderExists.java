package pkg.fileHandling;

import java.io.File;

public class FolderExists {

	public static void main(String[] args) {
		File f1 = new File("D://Goal 2025//24-25//IT//1. Programming//Java//jSpider//eclipse//Core Java//bin//pkg//fileHandling//Java420");
		
		if(f1.exists()) {
			System.out.println("Yes, Folder is present");
		}
		else {
			System.out.println("No, Folder is not present");
		}

	}

}
