package sm001.mod015IOstream;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader bis=null;
		try {
			try {
				bis = new BufferedReader(new FileReader("char_stream.txt"));
				System.out.println("-파일내용-");
				for(String line; (line=bis.readLine()) != null; ) {
					System.out.println(line);
				}
			}
			finally {
				bis.close();
			}
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
