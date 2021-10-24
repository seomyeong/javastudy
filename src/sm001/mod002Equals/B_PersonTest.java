package sm001.mod002Equals;

public class B_PersonTest {

	public static void main(String[] args) {
		B_Person bp = new B_Person(90123930303L);
		B_Person bp2 = new B_Person(90123930303L);
		
		if(bp==bp2) {
			System.out.println("bp==bp2는 같다.");
		}else {
			System.out.println("bp==bp2는 다르다.");
		}
		
		if(bp.equals(bp2)) {
			System.out.println("bp.equals(bp2)는 같다.");
		}else {
			System.out.println("bp.equals(bp2)는 다르다.");
		}
	}

}
