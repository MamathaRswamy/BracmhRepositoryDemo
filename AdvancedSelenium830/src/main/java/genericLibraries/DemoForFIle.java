package genericLibraries;

import java.io.File;

public class DemoForFIle {
	public static void main(String[] args) {
		String path="./Demo/deo.properties";
		new File(path).mkdirs();
		System.out.println("done");
	}
}
