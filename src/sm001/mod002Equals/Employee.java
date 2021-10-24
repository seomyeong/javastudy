package sm001.mod002Equals;

//직원 정보
public class Employee {
	public String name;
	public int age;
	public double salary;
	public String intro;
	
	public Employee(String name,int age, double salary, String intro) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.intro=intro;
	}
	
	public String getDetails() {
		return "이름 : "+name+"\n나이 : "+age+"\n연봉 : "+salary+"\n자기소개 : "+intro;
	}
	
}
