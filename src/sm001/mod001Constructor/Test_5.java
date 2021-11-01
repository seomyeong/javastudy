package sm001.mod001Constructor;
/**
 * 생성자연습 5
 * 조상클래스 '책'은 이름,페이지수를 지정한다.
 * '수학책','국어책','영어책'은 '책'을 상속받음.
 * 
 * @author 82108
 *
 */
class MathBook extends Test_5{
	private String grade;
	public MathBook(String bookname, int page, String grade) {
		super(bookname, page);
		this.grade=grade;
	}
	
	@Override
	public void bookInfo() {
		System.out.println("책이름 : "+bookname);
		System.out.println("책 페이지 수 : "+super.page+"p");
		System.out.println("수학등급 : "+grade);
	}

	
	
}
class KoreaBook extends Test_5{
	public KoreaBook(String bookname, int page) {
		super(bookname,page);
	}
}

public class Test_5 {
	protected String bookname;
	protected int page;
	
	public String getBookname() {return bookname;}
	public int getPage() {return page;}
	
	public Test_5(String bookname, int page) {
		this.bookname=bookname;
		this.page=page;
	}
	
	public void bookInfo() {
		System.out.println("책이름 : "+bookname);
		System.out.println("책 페이지 수 : "+page+"p");
	}
	
	/*------------------------------------------------*/
	public static void main(String[] args) {
		MathBook mathbook = new MathBook("수학책", 125,"1등급");
		KoreaBook koreabook = new KoreaBook("국어책", 200);
		
		mathbook.bookInfo();
		System.out.println();
		koreabook.bookInfo();
		
		System.out.println();
		
		/*부모타입 참조변수로 자식객체를 참조. 
		 * 단, 자식에서 부모타입의 메소드를 오버라이딩했을 경우
		 * 부모타입의 참조변수여도 오버라이딩된 메소드를 불러와진다. */
		Test_5 t5 = new MathBook("수학익힘책", 222, "3등급");
		t5.bookInfo();
	}
}
