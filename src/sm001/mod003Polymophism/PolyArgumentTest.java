package sm001.mod003Polymophism;
/**
 * 매개변수의 다형성 예제
 * 1. product, tv, computer, audio, shopper클래스를 정의
 * 2-1. product클래스는 tv, computer, audio의 조상이다.
 * 2-2. product클래스에는 제품의 가격, 제품구매시 제공하는 보너스점수를 담는 변수가 있다.
 * 3. buyer클래스에는 고객의 정보-소유중인 돈, 보너스포인트 변수가 있다.
 * @author 82108
 *
 */
class ProductInfo{
	public int price;
	public double bonuspoint;
	
	public ProductInfo(int price) {
		this.price=price;
		this.bonuspoint=(double)price/10.0;
	}
}

class Tv extends ProductInfo{
	public Tv() {
		super(500);
	}
	public String toString() {return "Tv";}
}
class Computer extends ProductInfo{
	public Computer() { super(700); }
	public String toString() {return "Computer";}
}
class Audio extends ProductInfo{
	public Audio() { super(400); }
	public String toString() {return "Audio";}
}

class Shopper{
	public int money=1000;
	public double bonuspoint;
	
	public void buy(ProductInfo p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;
		}
		this.money-=p.price;
		this.bonuspoint+=p.bonuspoint;
		System.out.println(p+"를 구매하셨습니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Shopper sp = new Shopper();
		sp.buy(new Computer());
		sp.buy(new Tv());
		
		System.out.println("현재 남은금액 : "+sp.money);
		System.out.println("현재 적립금 : "+sp.bonuspoint);
	}
}
