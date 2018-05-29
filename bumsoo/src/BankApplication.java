import java.util.Scanner;

public class BankApplication {
	//accountŬ���� Ÿ���� accountArray�迭�� ����
private static Account1[]accountArray = new Account1[100];
private static Scanner scanner = new Scanner(System.in);

public static void main(String[]args) {
	boolean run=true;
	while(run) {
		System.out.println("-----------------------------------");
		System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
		System.out.println("-----------------------------------");
		System.out.println("����>");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			//�޼ҵ� ȣ�� �κ�
			createAccount();
		}else if(selectNo==2) {
			accountList();
		}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run=false;
				}
			}
	System.out.println("���α׷�����");
		}
//���� ������ ���� createAccount�޼ҵ�
//���¹�ȣ,������,�ʱ��Աݾ��� �Է¹ް� ���°� �����Ǿ����ϴ�. ���
//�Է��� ������ �ٽ� �����ϴ� ������ ��µǾ� �߰��� ���»����� ������.
private static void createAccount() {
	//�ۼ���ġ
	/*String ano=scanner.next();
	String Owner=scanner.next();
	String balance=scanner.next();
	Account1 account = new Account();
	accountArray[0]=account; */
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		System.out.println("���¹�ȣ:");
		String ano= scanner.next();// ���¹�ȣ �Է��� ���� ����
		System.out.println("������:");
		String name=scanner.next();
		System.out.println("�ʱ��Ա޾�:");
		int balance =scanner.nextInt();
		Account1 ac= new Account1(ano,name,balance);
		//�Է¹��� ���� �迭 ������ �ϳ��� ����
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=ac;
				System.out.println("���¹�ȣ�� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
}
//���� ��Ϻ���
private static void accountList() {
	//�ۼ���ġ
	System.out.println("-----------");
	System.out.println("���¸��");
	System.out.println("-----------");
	for(int i=0;i<accountArray.length;i++) {
		Account1 account = accountArray[i]
		if(account!=null) {
			System.out.print(account.getAno());
			System.out.print(account.getOwner());
			System.out.print(account.getBalance                                                     ());
			
		}
	}
}
//����ó���� ���� �޼ҵ�
//�Ա��ϰ��� �ϴ� ������ ���¹�ȣ,�Աݾ��� �Է¹޾Ƽ�
//���¹�ȣ ��ġ���θ� �Ǵ��ϰ� ���� �ܾ׿� �Ա޾��� ���ؼ� �ܾ����� �����.

private static void deposit(){
	//�ۼ���ġ
	System.out.println("----------");
	System.out.println("����");
	System.out.println("----------");
	System.out.print("���¹�ȣ:");
	String ano= scanner.next();
	System.out.print("���ݾ�:");
	int money = scanner.nextInt();
	Account account = findAccount(ano);
	if(account==null) {
		System.out.println("���°� �����ϴ�.");
		return;
	}
	int balance=account.getBalance()+money;
	account.setBalance(balance);
	System.out.println("������ �����Ǿ����ϴ�.");
	System.out.println("�ܾ���"+account.getBalance()+"�Դϴ�.");
}
//�����
private static void withdraw() {
	//�ۼ���ġ
}
//Account�迭���� ano�� ������ Account ��ü ã��
//�Ű����� ano
//����Ÿ��:AccountŬ����
private static Account findAccount(String ano) {
Account1 account = null;//Account1Ŭ���� Ÿ���� ���� ����(ó���� ���� �� ���ϰ��� �ֱ� ����)
for(int i =0;i<accountArray.length;i++) {
	if(accountArray[i]!=null){
}String dbAno=accountArray[i].getAno();
if(dbAno.equals(ano)) {
	//��ġ�ϸ� �ش� �ε����� �ִ� ������ account������ ����
	account= accountArray[i];
}
return account;
}
}
