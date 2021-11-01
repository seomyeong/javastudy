package sm001.mod001JY;

public class StudentsProgram {
	public static void main(String[] args) {
		Student s1 = new Student("이동준", 2009038033, "남");
		Student s2 = new Student("이제영", 2007012034, "여");
		
		Student[] students = new Student[2];
		students[0]=s1;
		students[1]=s2;
		
		s2.setNum(2019038033);
		for(int i=0; i<students.length; i++) {
			students[i].stuInfo();
		}
	}
}
class Student{
	private String name;
	private int num;
	private String gender;
	
	public Student(String name, int num, String gender) {
		this.name=name;
		this.num=num;
		this.gender=gender;
	}
	public void setNum(int num) {this.num=num;}
	
	public void stuInfo() {
		System.out.println("학생 : "+name);
		System.out.println("학번 : "+num);
		System.out.println("성별 : "+gender);
	}
}
