package sm001.mod003Polymophism;
/**
 * Product01, SmartPhone01, NoteBook01, Cart01 클래스 생성
 * SmartPhone01, NoteBook01은 Product01을 상속받음
 * Product01의 멤버변수로는 price, name이 있음
 * @author 82108
 *
 */
class Product01{
	private String name;
	private double price;
	
	public String getName(){ return name; }
	public void setName(String name) { this.name=name; }
	
	public double getPrice() { return price; }
	public void setPrice(double price) { this.price=price; }
}
class SmartPhone01 extends Product01{}
class NoteBook01 extends Product01{}

class Cart01{
	Product01[] products = new Product01[2];
	/**
	 * 전달된 Product를 products 배열에 저장
	 * Product p : String name, double price를 가짐
	 */
	public void addProduct(Product01 p){
		for(int i=0; i<products.length; i++) {
			if(products[i]==null) {
				products[i]=p;
				break;
			}
		}
	}
	
	
	/**
	 * 상품정보가 담긴 product를 return
	 */

	
	/**
	 * cart(products 배열)에 담긴 products를 출력
	 */
	public void displayProductsInfo() {
		for(int i=0; i<products.length; i++) {
			if(products[i]!=null) {
				System.out.print("\n상품명  : "+products[i].getName());
				System.out.print("\n상품가격 : "+products[i].getPrice());
			}
		}
	}

}

public class PolyArgumentArrayTest2 {
	public static void main(String[] args) {
		Cart01 c = new Cart01();
		
		SmartPhone01 sp = new SmartPhone01();
		sp.setName("아이폰13");
		sp.setPrice(100.0);
		
		NoteBook01 nb = new NoteBook01();
		nb.setName("엘지그램");
		nb.setPrice(80.0);
		
		c.addProduct(sp);
		c.addProduct(nb);
		c.displayProductsInfo();
	}
}
