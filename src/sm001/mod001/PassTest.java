package sm001.mod001;

public class PassTest {
	public static void changeInt(int value) {
		value=55;
	}
	
	public static void changeObjectRef(MyDate ref) {
		ref=new MyDate(1995,5,29);
	}
	
	public static void changeObjectAttr(MyDate ref) {
		ref.setDay(4);
	}
	
	public static void main(String[] args) {
		int val=11;
		changeInt(val);
		
		MyDate d = new MyDate(7,7,1995);
		changeObjectRef(d);
		changeObjectAttr(d);
		System.out.println(d.getDetails());
	}
}
