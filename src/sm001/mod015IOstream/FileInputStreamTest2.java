package sm001.mod015IOstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* buffer에 담으면 한글이 출력됨 */

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		int totalBytes = 0;
		byte[] b = new byte[39];

		try {
			InputStream is = new FileInputStream("char_stream.txt");
			for(int chartest; (chartest=is.read(b))!= -1; ) {
				for(int i=0; i<chartest; i++) {
					System.out.write(b[i]);
				}
				System.out.println();
			}
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
