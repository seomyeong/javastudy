package sm001.mod001Constructor;
/**
 * 오버라이드, 오버로딩, 생성자, 다형성
 * @author 82108
 *
 */
class Cat{
	private String name;
	
	Cat(){
		this.name="나비";
	}
	Cat(String name){
		this.name=name;
	}
	public void showInfo() {
		System.out.println("이름 : "+name);
	}
}

class Cats extends Cat{
	private int age;
	private String gender;
	
	public Cats() {
		super();
		int age=0;
		String gender="수컷";
	}
	
	public Cats(String name, int age, String gender) {
		super(name);
		this.age=age;
		this.gender=gender;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
	}
}

public class Test_7 {
	public static void main(String[] args) {
		Cat c1 = new Cats("보리",5,"수컷");
		c1.showInfo();
	}
}