package sm001.mod001JY;

public class Gugudan {
	public static void main(String[] args) {
		GugudanNum g = new GugudanNum();
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				g.gugudanFunc(i, j);
			}
		}
	}
}
class GugudanNum{
	
	public void gugudanFunc(int x, int y) {
		System.out.println(x+" x "+y+" = "+x*y);
	}
}