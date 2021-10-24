package sm001.mod001;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getDetails(){
		return year+"-"+month+"-"+day;
	}
	
	public static void main(String[] args) {
		MyDate d = new MyDate(1995,5,20);
		d.setDay(23);
		d.setMonth(5);
		d.setYear(1995);
		System.out.println(d.getDetails());
	}
}
