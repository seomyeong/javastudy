package sm001.mod001GetSet;
/**
 * 년도, 월, 일을 생성하는 클래스 만들기
 * private 멤버를 외부에서 접근할때는 setter,getter나 생성자 사용하기
 * @author 82108
 *
 */
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public String getDate() {
		return year+"-"+month+"-"+day;
	}
}
