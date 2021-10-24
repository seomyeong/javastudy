package sm001.mod001Array;

public class StringArray02 {
	public static void main(String[] args) {
		Tv[] t = new Tv[3];
		for(int i=0; i<t.length; i++) {
			t[i]=new Tv(); //참조변수 t에 Tv레퍼런스 대입
			t[i].channel=i+10;
		}
		for(int i=0; i<t.length; i++) {
			t[i].channelUp();
			System.out.println("t["+i+"].channel="+t[i].channel);
		}
	}

}
class Tv{
	public String color;
	public boolean power;
	public int channel;
	
	public void power() {power = !power;}
	public void channelUp() {++channel;}
	public void channelDown() {--channel;}
}
