package sm001.mod001JY;

import java.util.Scanner;

/**
 * 입력된 알파벳 문자열의 각 글자들이 해당 문자열에서 몇 번째에서 처음 나왔는지 출력하시오. 
 * 예시) 입력 : baa => 'a'는 2번째에서 처음 등장합니다. ‘b’는 1번째에서 처음 등장합니다
 *
 */
public class Scanner1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요.");
		String alpha = s.next();

		for(int i=0; i<alpha.length();i++) {
			if(i==alpha.indexOf(alpha.charAt(i))) {
				System.out.println(alpha.charAt(i)+"는 "+i+"번째에서 처음 등장합니다.");
			}
		}
	}
}
