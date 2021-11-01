package sm001.mod001JY;

public class Student2 {
	public static void main(String[] args) {
		Student31 s = new Student31("이서명", 20211031, "여");
		System.out.println(s.stuInfo());
	}
}
class Student31{
	private String name;
	private int num;
	private String gender;
	
	public Student31(String name, int num, String gender) {
		this.name=name;
		this.num=num;
		this.gender=gender;
	}
	
	public String stuInfo() {
		return "이름 : "+name+"\n학번 : "+num+"\n성별 : "+gender;
	}
}
