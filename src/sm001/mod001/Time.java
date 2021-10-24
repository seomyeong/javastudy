package sm001.mod001;

public class Time {
	private int hour;
	private int minute;
	private float second;
	
	public Time(int hour, int minute, float second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			this.minute = minute;
		}
	}
	public float getSecond() {
		return second;
	}
	public void setSecond(float second) {
		if(second<0.0f || second>59.99f) {
			this.second = second;
		}
	}
	
	public String getTime() {
		return hour+"시 "+minute+"분 "+second+"초";
	}
	
	public static void main(String[] args) {
		Time t = new Time(1,5,30.0f);
//		t.hour=3;
//		t.minute=40;
//		t.second=10.5f;
		System.out.println(t.getTime());
	}
}
