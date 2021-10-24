package sm001.mod001;

public class MyDateTest {
	private int year;
	private int month;
	private int day;
	
	public MyDateTest(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public String myBirth() {
		return year+"-"+month+"-"+day;
	}
	
	public static void main(String[] args) {
		MyDateTest d = new MyDateTest(1999,5,29);
		System.out.println(d.myBirth());
	}

}
