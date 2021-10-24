package sm001.mod001Constructor;
/**
 * 생성자연습 2
 * 동물의 기본 인적사항 출력하기
 * @author 82108
 *
 */
public class Test_2 {
	private String name;
	private String animal;
	private int age;
	private int weight;
	
	public Test_2(String name, String animal, int age, int weight) {
		this.name=name;
		this.animal=animal;
		this.age=age;
		this.weight=weight;
	}
	public String getDetails() {
		return "이름 : "+name+"\n견종 : "+animal+"\n나이 : "+age+"\n몸무게 : "+weight;
	}
	
	public static void main(String[] args) {
		Test_2 t2 = new Test_2("예삐", "시츄", 3, 10);
		System.out.println(t2.getDetails());
	}
}
