package sm001.mod015IOstream;

import java.io.IOException;
import java.io.InputStream;

public class InputOutputStreamTest {
	public static void main(String[] args) {
		System.out.println("문자를 입력 후 ctrl-z를 입력해 빠져나가세요. ");
		
		try {
			for(int readTest; (readTest=System.in.read()) != -1; ) {
				if( readTest == 13 || readTest == 10 ) {
					continue;
				}
				System.out.write(readTest);
				System.out.print(readTest);
			}
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
