package sm001.mod001GetSet;
/**
 * get,set연습 1
 * 사람의 기본 인적사항 출력하기
 * @author 82108
 *
 */
public class Test_1 {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getInfo() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Test_1 t1 = new Test_1();
		t1.setName("이서명");
		String n = t1.getName();
		
		t1.setAge(27);
		System.out.println(n);
		System.out.println(t1.age);
	}

}
