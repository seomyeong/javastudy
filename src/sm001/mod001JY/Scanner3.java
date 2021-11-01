package sm001.mod001JY;

import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String test = s.next();

		for(int i=0; i<test.length();i++) {
			int chNum=0;
			for(int j=i; j<test.length(); j++) {
				if(test.charAt(j)==test.charAt(i)) {
				chNum++;
				}
				if(i==test.indexOf(test.charAt(i)))
					System.out.printf("%c는 %d글자 입니다.\n", test.charAt(i), chNum);
			}
		}

	}
}
