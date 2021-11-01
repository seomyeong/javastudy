package sm001.mod001JY;

public class Practice3_4 {
	public static void main(String[] args) {
		func();
	}//end of main
	public static void func() {
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%3==0) {continue;}
			sum+=i;
		}
		System.out.println(sum);
	}
}//end of class
