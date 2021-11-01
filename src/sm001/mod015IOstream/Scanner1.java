package sm001.mod015IOstream;

import java.util.Scanner;

/**
 * 입력된 알파벳 문자열의 각 글자들이 해당 문자열에서 몇 번째에서 처음 나왔는지 출력하시오. 
 * 예시) 입력 : baa => 'a'는 2번째에서 처음 등장합니다. ‘b’는 1번째에서 처음 등장합니다
 *
 */
public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 >");
		String alpha = sc.next();
		for(int i=0; i<alpha.length();i++) {
			if(i==alpha.indexOf(alpha.charAt(i))) { //i랑 alpha의 index번호(alpha를 문자로 바꿈)가 같으면?
				System.out.println(alpha.charAt(i)+"는 "+i+"번 째 등장합니다.");
			}
		}
	}
}
