package sm001.mod003Polymophism;

public class Cart {
	Product[] products = new Product[2];
	/**
	 * 전달된 Product를 products 배열에 저장
	 * Product p : String name, double price를 가짐
	 */
	public void addProduct(Product p) {
		for(int i=0; i<products.length;i++) {
			if(products[i]==null) {
				products[i]=p; //products[0],[1],[2]에 p의 멤버를 넣는다
				break;
			}
		}
	}
	
	/**
	 * 상품정보가 담긴 product를 return
	 */
//	public Product[] getProducts() {
//		return products;
//	}
	
	/**
	 * cart(products 배열)에 담긴 products를 출력
	 */
	public void displayProductsInfo() {
		for(int i=0; i<products.length; i++) {
			if(products[i]!=null) {
				System.out.print("\n상품명 : "+products[i].getName());
				System.out.print("\n상품가격 : "+products[i].getPrice());
			}
		}
	}
}
