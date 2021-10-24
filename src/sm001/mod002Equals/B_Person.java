package sm001.mod002Equals;

public class B_Person {
	public long id;
	
	public B_Person(long id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof B_Person)) {return false;}
		B_Person bp = (B_Person)obj;
		if(bp.id==this.id) {
			return true;
		}
		return false;
	}
	
}
