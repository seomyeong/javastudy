package sm001.mod003Polymophism;
public class A_CastingTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		
		FireEngine fe = (FireEngine)c; // <-Car는 FireEngine으로 형변환될 수 없다?
		fe.water();
		
//		FireEngine fe = new FireEngine();
//		fe.water();
//		
//		Car c = (Car)fe;
//		c.drive();
//		
//		FireEngine fe2 = (FireEngine)c;
//		fe2.water();
	}
}
	class Car{
		public String color;
		public int door;
		
		public void drive() {
			System.out.println("drive");
		}
		public void stop() {
			System.out.println("stop");
		}
//		public void water() {}
	}
	class FireEngine extends Car{
		public void water() {
			System.out.println("water");
		}
	}


