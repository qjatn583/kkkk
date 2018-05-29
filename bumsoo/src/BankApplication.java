import java.util.Scanner;

public class BankApplication {
	//account클래스 타입의 accountArray배열을 선언
private static Account1[]accountArray = new Account1[100];
private static Scanner scanner = new Scanner(System.in);

public static void main(String[]args) {
	boolean run=true;
	while(run) {
		System.out.println("-----------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("-----------------------------------");
		System.out.println("선택>");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			//메소드 호출 부분
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
	System.out.println("프로그램종료");
		}
//계좌 생성을 위한 createAccount메소드
//계좌번호,계좌주,초기입금액을 입력받고 계좌가 생성되었습니다. 출력
//입력이 끝나면 다시 선택하는 내용이 출력되어 추가로 계좌생성이 가능함.
private static void createAccount() {
	//작성위치
	/*String ano=scanner.next();
	String Owner=scanner.next();
	String balance=scanner.next();
	Account1 account = new Account();
	accountArray[0]=account; */
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.println("계좌번호:");
		String ano= scanner.next();// 계좌번호 입력을 위한 변수
		System.out.println("계좌주:");
		String name=scanner.next();
		System.out.println("초기입급액:");
		int balance =scanner.nextInt();
		Account1 ac= new Account1(ano,name,balance);
		//입력받은 값을 배열 변수에 하나씩 저장
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=ac;
				System.out.println("계좌번호가 생성되었습니다.");
				break;
			}
		}
	}
	
}
//계좌 목록보기
private static void accountList() {
	//작성위치
	System.out.println("-----------");
	System.out.println("계좌목록");
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
//예금처리를 위한 메소드
//입금하고자 하는 계좌의 계좌번호,입금액을 입력받아서
//계좌번호 일치여부를 판단하고 기존 잔액에 입급액을 더해서 잔액으로 만든다.

private static void deposit(){
	//작성위치
	System.out.println("----------");
	System.out.println("예금");
	System.out.println("----------");
	System.out.print("계좌번호:");
	String ano= scanner.next();
	System.out.print("예금액:");
	int money = scanner.nextInt();
	Account account = findAccount(ano);
	if(account==null) {
		System.out.println("계좌가 없습니다.");
		return;
	}
	int balance=account.getBalance()+money;
	account.setBalance(balance);
	System.out.println("예금이 성공되었습니다.");
	System.out.println("잔액은"+account.getBalance()+"입니다.");
}
//출금하
private static void withdraw() {
	//작성위치
}
//Account배열에서 ano와 동일한 Account 객체 찾기
//매개변수 ano
//리턴타입:Account클래스
private static Account findAccount(String ano) {
Account1 account = null;//Account1클래스 타입의 변수 선언(처리가 끝난 후 리턴값을 주기 위해)
for(int i =0;i<accountArray.length;i++) {
	if(accountArray[i]!=null){
}String dbAno=accountArray[i].getAno();
if(dbAno.equals(ano)) {
	//일치하면 해당 인덱스에 있는 내용을 account변수에 저장
	account= accountArray[i];
}
return account;
}
}
