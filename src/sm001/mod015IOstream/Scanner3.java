package sm001.mod015IOstream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(new FileReader("scannertest.txt"));
			while(s.hasNext()) {
//				String line = s.next();
				String line = s.nextLine();
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

