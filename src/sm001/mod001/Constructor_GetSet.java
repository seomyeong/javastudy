package sm001.mod001;

public class Constructor_GetSet {
	private String name;
	private int age;
	private double height;
	private String mbti;
	
	public String getMbti() {
		return mbti;
	}
	public void setMbti(String mbti) {
		this.mbti=mbti;
	}
	
	public Constructor_GetSet(String name, int age, double height, String mbti) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.mbti=mbti;
		System.out.println("----생성자----");
	}
	public void getInfo() {
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n키 : "+height+"\nmbti : "+mbti);
	}
	

	public static void main(String[] args) {
		Constructor_GetSet cgs = new Constructor_GetSet("이서명", 27, 153.2, "infj");
		cgs.setMbti("enfj");
		cgs.getInfo(); //메소드의 타입이 void이면 바로 메소드 호출
//		System.out.println(cgs.getInfo()); //메소드의 타입이 void가 아니면 출력문에서 호출
//		System.out.println(cgs.name+cgs.height+cgs.age);
		
	}

}
