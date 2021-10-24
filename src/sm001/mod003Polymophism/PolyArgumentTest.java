//package sm001.mod003Polymophism;
///**
// * 매개변수의 다형성 예제
// * 1. product, tv, computer, audio, buyer클래스를 정의
// * 2-1. product클래스는 tv, computer, audio의 조상이다.
// * 2-2. product클래스에는 제품의 가격, 제품구매시 제공하는 보너스점수를 담는 변수가 있다.
// * 3. buyer클래스에는 고객의 정보-소유중인 돈, 보너스포인트 변수가 있다.
// * @author 82108
// *
// */
//class ProductInfo{
//	public int price;
//	public int bonuspoint;
//	
//	public ProductInfo(int price) { //bonuspoint는 초기화시킬필요 없음
//		this.price=price;
//		this.bonuspoint=(int)(price/10.0);
//	}
//}
//class Tv extends ProductInfo{
//	public Tv() {
//		super(100);
//	}
//	public String toString() {return "Tv";} //Object클래스의 toString() 오버라이드
//}
//class Computer extends ProductInfo{
//	public Computer() {
//		super(200);
//	}
//	public String toString() {return "Computer";}
//}
//class Audio extends ProductInfo{
//	public Audio() {
//		super(150);
//	}
//	public String toString() {return "Audio";}
//}
//
//class Buyer{
//	public int money=1000;
//	public int bonuspoint;
//	
////	public void buy(Tv t) { //Buyer클래스의 메서드 buy는 tv를 구입하면 money를 빼고 보너스포인트를 충전시킨다.
////		money=money-t.price;
////		bonuspoint=bonuspoint+t.bonuspoint;
////	}
////	public void buy(Computer c) { //이런식으로 제품 하나하나씩 만들면 코드가 길어짐. (= 오버로딩)
////		money=money-c.price;
////		bonuspoint=bonuspoint+c.bonuspoint;
////	}
//	
//	public void buy(ProductInfo p) { //매개변수를 조상클래스로 하여 조상클래스의 멤버들을 사용하게 한다.
//		if(money < p.price) {
//			System.out.println("잔액부족으로 구매하실 수 없습니다");
//		}
//		money=money-p.price;
//		bonuspoint=bonuspoint+p.bonuspoint;
//		System.out.println(p+"를 구매하셨습니다."); //참조변수와 문자열이 결합하면 +연산자에 의해 toString이 호출됨, 그래서 toString을 오버라이드한 것
//	}
//}
//
//public class PolyArgumentTest {
//	public static void main(String[] args) {
//		Buyer b = new Buyer();
////		Computer c = new Computer();
////		b.buy(c);
//		
//		b.buy(new Computer()); //한 문장으로 줄인것. Buyer클래스의 buy메소드 호출해서 매개변수로 Computer를 넣었다.
//		b.buy(new Audio());
//		b.buy(new Tv());
//		
//		System.out.println("현재 남은돈은 : "+b.money+"입니다.");
//		System.out.println("현재 포인트는 : "+b.bonuspoint+"입니다.");
//	}
//}
