package sm001.mod003Polymophism;

public class AppleOverdrawnException extends Exception {
	public int money;

	public AppleOverdrawnException(String msg, int money) {
		super(msg);
		this.money=money;
	}

	@Override
	public String getMessage() {
		return super.getMessage()+" 잔액부족 : 현재 잔고는 "+money+"입니다.";
	}
}
