package sm001.mod015IOstream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		File testFile = new File("char_stream.txt");
		
		System.out.println("\nsize : "+testFile.length()+"Bytes");
		System.out.println("path : "+testFile.getAbsolutePath()+"\n");
		
		try {
			FileReader fr = new FileReader(testFile);
			System.out.println("-파일내용-");
			
			for(int frRead; (frRead=fr.read()) != -1; ) {
				if(frRead != 13 && frRead != 10) {
					System.out.print((char)frRead);
				}
				else if(frRead == 10) {
					continue;
				}
				else {
					System.out.println();
				}
			}
			
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		
	}
}
