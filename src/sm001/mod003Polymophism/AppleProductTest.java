package sm001.mod003Polymophism;
/**
 * 객체를 배열로 다루기,
 * '애플'클래스는 상품이름, 가격, 보너스포인트 변수가 있음
 * 에어팟과 아이폰클래스는 '애플'클래스를 상속받음.
 * 구매자 클래스 추가.
 * @author 82108
 *
 */


public class AppleProductTest {
	public static void main(String[] args){
		AppleBuyer tom = new AppleBuyer();
		
		try {
			tom.buy(new Airpods("myAirpods"));
			tom.buy(new Iphone("red"));
			tom.buy(new Iphone("pink"));
			System.out.println("남은 금액 : "+tom.money);
		}catch(AppleOverdrawnException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
class Apple{
	public int price;
	public int bonuspoint;
	
	public Apple(int price) {
		this.price=price;
		this.bonuspoint=(int)(price/10.0);
	}
}

class Airpods extends Apple{
	public String seal;
	
	public Airpods(String seal) {
		super(600);
		this.seal=seal;
	}
	@Override
	public String toString() {return "Airpods"+" : "+seal;}
}

class Iphone extends Apple{
	public String color;
	
	public Iphone(String color) {
		super(1200);
		this.color=color;
	}
	@Override
	public String toString() {return "Iphone"+" : "+color;}
}

class AppleBuyer{
	public int money=2000;
	private int bonuspoint=0;
	
//	public void getMoney() {this.money=money;}
	public void getBonuspoint() {this.bonuspoint=bonuspoint;}
	
	public void buy(Apple ap) throws AppleOverdrawnException{
		if(this.money <=ap.price) {
			throw new AppleOverdrawnException("[ERROR]", money);
		}else {
			money-=ap.price;
			bonuspoint+=ap.bonuspoint;
			System.out.println(ap+"를 구매하셨습니다.");
			System.out.println(this.money+"원 남았습니다.");
			System.out.println(ap.bonuspoint+"점 적립");
		}
	}
}