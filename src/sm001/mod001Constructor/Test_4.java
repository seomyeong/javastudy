package sm001.mod001Constructor;
/*생성자 4
 * */
public class Test_4 {
	private double balance;
	
	public Test_4(double initBalance) {
		this.balance=initBalance;
	}
	
	public double getBalance() {return balance;}
	//입금
	public void deposite(double amount) {
		this.balance+=amount;
	}
	//출금
	public void withdraw(double amount) {
		this.balance-=amount;
	}
	
	public static void main(String[] args) {
		Test_4 account = new Test_4(500.0);
		account.deposite(1500);
		account.withdraw(1700);
//		account.getBalance();
		System.out.println("잔액 : "+account.balance);
	}

}
