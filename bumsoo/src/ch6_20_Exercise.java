
public class ch6_20_Exercise {
private String OwnerName;
private int AccountNumber;
private int Balance;


public void result() {
	System.out.println("������"+OwnerName);
	System.out.println("���¹�ȣ"+AccountNumber);
	System.out.println("�ܾ�"+Balance);
}
public String getOwnerName() {
	return OwnerName;
}
public void setSetOwnerName(String OwnerName) {
	this.OwnerName = OwnerName;
}
public int getAccountNumber() {
	return AccountNumber;
}
public void setAccountNumber(int AccountNumber) {
	this.AccountNumber = AccountNumber;
}
public int getSetBalance() {
	return Balance;
}
public void setSetBalance(int setBalance) {
	this.Balance = Balance;
}
public void deposit(int amount){
	this.Balance=this.Balance+amount;
}
public void withdraw(int amount) {
	this.Balance=this.Balance-amount;
}
}


