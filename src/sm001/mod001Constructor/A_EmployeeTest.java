package sm001.mod001Constructor;

import java.util.Date;

public class A_EmployeeTest {
public static void main(String[] args) {
	A_Employee ae = new A_Employee("이서명", 2400.0, new Date(29,5,1995));
	System.out.println(ae.getDetails());
	
	A_Manager am = new A_Manager("백지윤", 2500.0, new Date(7,7,1995), "isfp");
	System.out.println(am.getDetails());
}
}
