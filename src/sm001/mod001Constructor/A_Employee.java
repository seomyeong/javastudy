package sm001.mod001Constructor;

import java.util.Date;

/**
 * 이름, 연봉, 생일 정보를 가지고 있는 직원 클래스와
 * 이를 상속받는 클래스에서 바로 값을 부여할 수 있도록 하기.
 * 이를 문장으로 출력하는 메소드를 생성.
 * @author 82108
 *
 */
public class A_Employee {
	public String name="";
	public double salary;
	public Date birthDate; //Date를 사용하려면 import필요
	
	public A_Employee(String name, double salary, Date birthDate) {
		this.name=name;
		this.salary=salary;
		this.birthDate=birthDate;
	}
	
	public String getDetails() {
		return "이름 : "+name+"\n연봉 : "+salary+"\n생일 : "+birthDate;
	}
}
