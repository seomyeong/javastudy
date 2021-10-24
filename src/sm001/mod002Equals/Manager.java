package sm001.mod002Equals;

public class Manager extends Employee{
	public String mbti;
	
	public Manager(String name,int age, double salary, String intro,String mbti) {
		super(name,age,salary,intro);
		this.mbti=mbti;
	}
	public String getDetails() {
		return super.getDetails()+"\nMBTI : "+mbti;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Manager)) {
			return false;
		}
		Manager m = (Manager)obj;
		if(m.name.equals(this.name) && m.intro.equals(this.intro) && m.mbti.equals(this.mbti)) {
			return true;
		}
		return false;
		
	}
}
