package sm001.mod001Constructor;

import java.util.Date;

/**
 * Manager클래스는 Employee클래스를 상속받음
 * Manager클래스는 mbti변수를 추가로 갖고있음
 * @author 82108
 *
 */
public class A_Manager extends A_Employee {
	public String mbti="";

	public A_Manager(String name, double salary, Date birthDate, String mbti) {
		super(name,salary,birthDate);
		this.mbti=mbti;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()+"\nMBTI : "+mbti;
	}
}
