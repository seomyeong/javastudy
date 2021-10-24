package sm001.mod001Constructor;
/**
 * 생성자연습 1
 * 사람의 기본 인적사항 출력하기
 * @author 82108
 *
 */
public class Test_1 {
	public String name;
	public int age;
	public double height;
	public double weight;
	
	public Test_1(String name, int age, double height, double weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	public String tInfo() {
		return "이름 : "+name+"\n나이 : "+age+"\n키 : "+height+"\n몸무게 : "+weight;
	}
	
	public static void main(String[] args) {
		Test_1 t1 = new Test_1("이서명",27,173.0,53.0);
		System.out.println(t1.tInfo());
	}
	
}
