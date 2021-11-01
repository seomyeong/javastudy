package sm001.mod003Polymophism;

public class CartTest {
	public static void main(String[] args) {
//		Cart myCart = new Cart();
//		
//		SmartPhone phone = new SmartPhone();
//		phone.setName("갤럭시노트");
//		phone.setPrice(90);
//		myCart.addProduct(phone); //myCart의 addProduct메소드에 phone객체 넣기
//	
//		NoteBook note = new NoteBook();
//		note.setName("맥북에어");
//		note.setPrice(150);
//		myCart.addProduct(note);
//		
//		myCart.displayProductsInfo();
		
		Cart myCart = new Cart();
		SmartPhone phone = new SmartPhone();
		phone.setName("아이폰13");
		phone.setPrice(1500.0);
		
		NoteBook note = new NoteBook();
		note.setName("맥북에어");
		note.setPrice(2000.0);
		
		myCart.addProduct(phone);
		myCart.addProduct(note);
		myCart.displayProductsInfo();
		
	}
	
}
