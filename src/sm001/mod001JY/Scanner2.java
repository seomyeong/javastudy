package sm001.mod001JY;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요. >");
		int year = sc.nextInt();
		searchYear(year);
	}
	public static void searchYear(int year) {
		int g=12;
		for(int i=0; i<=2021; i++) {
			if(year==4+(g*i))
				System.out.println("쥐띠입니다.");
			else if(year==5+(g*i))
				System.out.println("소띠입니다.");
			else if(year==6+(g*i))
				System.out.println("호랑이띠입니다.");
			else if(year==7+(g*i))
				System.out.println("토끼띠입니다.");
			else if(year==8+(g*i))
				System.out.println("용띠입니다.");
			else if(year==9+(g*i))
				System.out.println("뱀띠입니다.");
			else if(year==10+(g*i))
				System.out.println("말띠입니다.");
			else if(year==11+(g*i))
				System.out.println("양띠입니다.");
			else if(year==12+(g*i))
				System.out.println("원숭이띠입니다.");
			else if(year==1+(g*i))
				System.out.println("닭띠입니다.");
			else if(year==2+(g*i))
				System.out.println("개띠입니다.");
			else if(year==3+(g*i))
				System.out.println("돼지띠입니다.");
		}
	}
}
