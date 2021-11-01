package sm001.mod015IOstream;

import java.util.Scanner;

/**
 * 이름과 나이를 입력받아 출력하기
 * @author 82108
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
		System.out.print("이름 입력 : ");
		String name=sc.next();
		
		Test1.Everyone(age, name);
	}		
	public static void Everyone() {
		System.out.println("다음에 뵙겠습니다.");
	}
	public static void Everyone(int age, String name) {
		System.out.print("나이 : "+age+"\n이름 : "+name);
	}
}
