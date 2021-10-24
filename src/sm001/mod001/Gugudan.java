package sm001.mod001;

public class Gugudan {
	private int num1;
	private int num2;
	private int result;
	
	public int gugudanTest(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		result=num1*num2;
		return result;
	}
	public void gugudanResult() {
		System.out.print(num1+"*"+num2+"="+result+"\t");
	}
	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=1; j<=9; j++) {
				g.gugudanTest(j, i);
				g.gugudanResult();
			}
		}
	}
}
