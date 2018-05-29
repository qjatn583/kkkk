
public class ch06_20_ExerciseEx {
public static void main(String[]args) {
	ch6_20_Exercise acct = new ch6_20_Exercise();
	acct.setSetOwnerName("ȫ�浿");
	acct.setAccountNumber(101);
	acct.setSetBalance(10000);
	acct.deposit(3000);
	acct.withdraw(5000);
	acct.result();
}
}
