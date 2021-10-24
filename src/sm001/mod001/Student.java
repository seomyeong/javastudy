package sm001.mod001;

//지윤이한테 받은 생성자, 오버로딩 예제
public class Student{
	public static void main(String[] args) {
		Student1 st = new Student1("이서명",27,153.2,3,80);
		st.setAge(29);
		st.studentIntroduce();
	}
}

class Student1 extends Person {
	private int grade;
	private int score;
	
//	public Student1() {
//		super();
//		int grade=1;
//		int score=0;
//	}
	
	public Student1(String name, int age, double height, int grade, int score) {
		super(name,age,height); //person의 파라미터 호출
		this.grade=grade;
		this.score=score;
	}
	
	public void studentIntroduce() {
		super.Introduce();
		System.out.println("학년 : "+grade);
		System.out.println("성적 : "+score);
	}
}
