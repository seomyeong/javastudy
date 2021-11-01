package sm001.mod001Constructor;
/**
 * 나이와 키를 입력받아 출력
 * @author 82108
 *
 */
public class Test_6 {
	public static void main(String[] args) {
		Info i = new Info(27, 153.0);
		i.getInfo();
	}
}
class Info{
	private int age;
	private double height;
	
	//생성자
	public Info(int age, double height) {
		this.age=age;
		this.height=height;
	}
	
	//메소드
	public void getInfo() {
		System.out.println("나이 : "+age+"\n키 : "+height);
	}
	
}