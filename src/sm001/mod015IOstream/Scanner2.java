package sm001.mod015IOstream;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		int value = s.nextInt();
		boolean flag = s.nextBoolean();
		double db = s.nextDouble();
		
		System.out.println("str : "+str);
		System.out.println("value : "+value);
		System.out.println("flag : "+flag);
		System.out.println("double : "+db);
	}
}
