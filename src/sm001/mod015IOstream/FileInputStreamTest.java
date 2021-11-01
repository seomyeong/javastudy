package sm001.mod015IOstream;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) {
		InputStream is = null;
		int totalBytes = 0;
		
		try {
			try {
				is = new FileInputStream("char_stream.txt");
				for(int readBytes; (readBytes=is.read())!=-1;) {
					System.out.write(readBytes);
					totalBytes++;
				}				
			}finally {
				is.close();
			}
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println(totalBytes);
	}
}
