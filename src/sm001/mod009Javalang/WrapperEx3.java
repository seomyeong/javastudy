package sm001.mod009Javalang;

public class WrapperEx3 {
	public static void main(String[] args) {
		int i=10;
		
		Integer intg = (Integer)i; //기본형 변수를 참조형 변수로 형변환. 컴파일 후 코드 : Integer intg=Integer.valueof(i);
		Object obj = (Object)i; //컴파일 후 코드 : Object obj=(Object)Integer.valueof(i);
		
		Long lng = 100L; // 컴파일 후의 코드 : Long lng = new Long(100L);
		
		int i2 = intg + 10; //참조형과 기본형간의 연산 가능
		long l = intg + lng ; //참조형간의 덧셈 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; //참조형변수를 기본형으로 형변환 가능
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("intg = "+intg);
		System.out.println("obj = "+obj);
		System.out.println("i2 = "+i2);
		System.out.println("l = "+l);
		System.out.println("intg3 = "+intg3);
	}
}
