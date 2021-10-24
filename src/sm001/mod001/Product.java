package sm001.mod001;

class ProductInfo {
	int price; //제품의 가격
	int bonusPoint; //제품구매시 제공하는 보너스점수
	
	ProductInfo(int price) { //매개변수가 있는 생성자
		this.price = price; //멤버변수와 지역변수 구분 시 this. 사용
		bonusPoint = (int)(price/10.0); //보너스점수는 price의 10%
	}
}

class Tv1 extends ProductInfo {
	Tv1() {super(100);} //조상의 생성자를 호출할 때 super()사용, 조상의 생성자인
	                   //Product(int price)를 호출 후 100으로 설정
	public String toString() {return "Tv";} //Object클래스의 toString()을 오버라이딩
}
class Computer extends ProductInfo {
	Computer() {super(200);}
	public String toString() {return "Computer";}
}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(ProductInfo p) { //매개변수로 참조변수를 선언
		if(money<p.price) {
			System.out.println("잔액부족. 물건을 살 수 없습니다");
			return;
		}
		money -= p.price; //가진돈에서 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구매하셨습니다");
	}
}
public class Product {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남은돈은 "+b.money+"만원입니다");
		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다");
	}
}