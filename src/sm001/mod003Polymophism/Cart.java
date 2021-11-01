package sm001.mod003Polymophism;

public class Cart {
	Product[] products = new Product[2]; //객체배열타입 products 2개 생성
	/**
	 * 전달된 Product를 products 배열에 저장
	 * !!객체배열을 생성 후 배열에 값을 저장해야하는 것을 잊지말기!!
	 * Product p : String name, double price를 가짐
	 * 매개변수를Product p로 가졌다는 것은 Product의 멤버를 사용하겠다는 뜻
	 * 메서드작업에 필요한 것 : Product p
	 */
	
	public void addProduct(Product p) {
		for(int i=0; i<products.length; i++) {
			if(products[i]==null) {
				products[i]=p;//products[0],[1],[2]에 p의 멤버를 넣는다
				break;
			}
		}
	}
	
	/**
	 * 상품정보가 담긴 product를 return
	 */
	public Product[] getProducts() {
		return products;
	}
	
	/**
	 * cart(products 배열)에 담긴 products를 출력
	 */
	public void displayProductsInfo() {
		for(int i=0; i<products.length; i++) {
			if(products[i]!=null) {
				System.out.println("상품명 : "+products[i].getName());
				System.out.println("상품가격 : "+products[i].getPrice());
			}
		}
	}
}
