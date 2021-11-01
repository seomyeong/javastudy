package sm001.mod001;

public class Hello {
	public void sayHello() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Hello h = new Hello();
		h.sayHello();
		
		int i=5;
		Integer i2=new Integer("7");
		int sum=i+i2;
		System.out.println(sum);
	}
	
}
