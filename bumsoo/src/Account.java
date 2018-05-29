
public class Account {
	public static final int MIN_BALANCE=0;
	public static final int MAX_BALANCE=1000000;
	
	private int balance;
	public int getAccount() {
		return balance;
	}
public void setBalance(int balance) {
	if(balance<MIN_BALANCE||balance>MAX_BALANCE) {
		
	}else {
		this.balance=balance;
	}
}
public int getBalance() {
	// TODO Auto-generated method stub
	return 0;
}
	}

