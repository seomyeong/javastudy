package sm001.mod001JY;
/**
 * 임의의 양수인 전체 '초'시간을 사용자로부터 입력받아
 * 분과 초로 변환하기
 */
import java.util.Scanner;

public class Practice4_3 {
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		System.out.println("초를 입력하세요 > ");
		int myTime = time.nextInt();
		
		if(myTime >= 60) {
			int min=myTime/60;
			int sec=myTime%60;
			System.out.println(min+"분 "+sec+"초 입니다.");
		}
	}
	
}
