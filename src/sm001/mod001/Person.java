package sm001.mod001;
//지윤이한테 받은 생성자, 오버로딩 예제
public class Person {
	private String name;
	private int age;
	private double height;
	
//	public Person() { //매개변수가 없으면 디폴트 생성자
//		String name="홍길동";
//		int age=20;
//		double height=173.4;
//	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public Person(String name, int age, double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void Introduce() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
	}
}
