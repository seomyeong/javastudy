package sm001.mod003Polymophism;
/**
 * 객체를 배열로 다루기
 * @author 82108
 *
 */
class Productsm{
	public int price;
	public int bonuspoint;
	
	public Productsm(int price) {
		this.price=price;
		bonuspoint=(int)(price/10.0);
	}
}
class Toy extends Productsm{
	public Toy() { super(300); }
	public String toString() {return "Toy";}
}
class Puzzle extends Productsm{
	public Puzzle() { super(600); }
	public String toString() {return "Puzzle";}
}

class Buyer{
	public int money=1000;
	public int bonuspoint=0;
	
	Productsm[] item = new Productsm[10]; //구매한 제품을 저장하기 위한 배열. 배열객체 생성 후 값저장 필수!!
	int i=0; //배열을 돌리기 위한 카운터

	public void buy(Productsm p) {
		if(money < p.price) { System.out.println("잔액부족 : "+p+"를 구매할 수 없습니다."); }
		money=money-p.price;
		bonuspoint=bonuspoint+p.bonuspoint;
		item[i++]=p; //item[0]~[10]에 p 저장
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	public void summary() {
		//총 구매 합계, 구매한 아이템을 보여주는 메소드
		int sum=0;
		String itemList="";
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) {break;}
			sum=sum+item[i].price;
			itemList=itemList+item[i];
		}
		System.out.println("총 구매합계 : "+sum);
		System.out.println("구매한 상품 : "+itemList);
	}
}

public class PolyArgumentArrayTest {
	public static void main(String[] args) {
//		Toy toy = new Toy();
		try {
		Buyer b = new Buyer();
		b.buy(new Toy());
		b.buy(new Puzzle());
		System.out.println("남은 금액 : "+b.money);
		System.out.println("포인트점수 : "+b.bonuspoint);
		b.summary();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("오류 : "+e.getMessage());
		}
		
	}
}
