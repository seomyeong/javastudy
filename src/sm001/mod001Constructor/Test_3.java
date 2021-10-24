package sm001.mod001Constructor;
/**
 * 생성자??연습 3
 * 구구단 출력
 * @author 82108
 *
 */
public class Test_3 {
	public int x;
	public int y;
	public int result;
	
	public int gugudanTest(int x, int y) { //매개변수값을 받는 메서드1
		this.x=x;
		this.y=y;
		this.result=x*y;
		return result;
	}
	
	public String gugudan() { //메서드2
		return "\t"+x+"*"+y+"="+x*y;
	}
	
	public static void main(String[] args) {
		Test_3 t3 = new Test_3();
		
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=2; j<=9; j++) {
				t3.gugudanTest(j, i);
				System.out.print(t3.gugudan());
			}
		}
	}
}
