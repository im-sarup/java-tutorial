package pkg.fileHandling;

import java.io.File;

public class FolderDelete {

	public static void main(String[] args) {
		File f1 = new File("D://Goal 2025//24-25//IT//1. Programming//Java//jSpider//eclipse//Core Java//bin//pkg//fileHandling//Java420");
		
		if(f1.delete()) {
			System.out.println("Yes, Folder deleted successfully");
		}
		else {
			System.out.println("No, Folder is not deleted");
		}
	}

}
