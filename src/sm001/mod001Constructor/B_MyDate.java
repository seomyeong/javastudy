package sm001.mod001Constructor;

public class B_MyDate {
	private int day;
	private int month;
	private int year;
	public static int weight;
	
	public B_MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	
	
	public String getDetails() {
		return year+"-"+month+"-"+day;
	}

}
