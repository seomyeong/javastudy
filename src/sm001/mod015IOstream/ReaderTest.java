package sm001.mod015IOstream;

import java.io.*;

public class ReaderTest {
	public static void main(String[] args) {
		System.out.println("문자를 입력 후 ctrl-z를 눌러서 빠져나가세요");
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			try {
				for(int readChar; (readChar=is.read())!= -1; ) {
					if(readChar == 10 || readChar == 13 ) {continue;}
					else if(readChar != 10 && readChar !=13) {
						System.out.print("입력 : ");
						System.out.print((char)readChar);
					}
					System.out.println(" 숫자값 : "+readChar);
				}
			}finally {
				is.close();
			}
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
