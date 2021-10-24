package sm001.mod002Equals;

public class EmployeeTest {

	public static void main(String[] args) {
//		Manager m = new Manager("이서명",21,3000.0,"잘부탁드립니다!","infj");
//		System.out.println(m.getDetails());
//		System.out.println("-------------------------");
//		
//		Employee e = new Manager("백지윤",22,3000.0,"잘부탁드립니다!","isfp");
//		System.out.println(e.getDetails());
//		System.out.println("-------------------------");
		
		Manager m = new Manager("이서명",21,3000.0,"잘부탁드립니다!","infj");
		Manager m2 = new Manager("이서명",21,3000.0,"잘부탁드립니다!","infj");
		
		
		
		if(m==m2) {
			System.out.println("m과 m2가 같다.");
		}else {
			System.out.println("m과 m2가 다르다.");
		}
		
		if(m.equals(m2)) {
			System.out.println("m.equals(m2)의 값은 같다.");
		}else {
			System.out.println("m.equals(m2)의 값은 다르다.");
		}
		
	}

}
