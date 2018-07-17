package ja0530;

public class Ex {
public static void main(String[]args) {
	//사전예약 티켓 또는 일반 티켓을 각각 객체로 만들어서 정보를 출력
	AdvancedTicket adticket= new AdvancedTicket(100,20);
	adticket.setPrice(100000);
	
	System.out.println("당신의 사전예약 티켓번호는"+adticket.getNumber()+"이고 구매가격은"+adticket.getPrice()+"입니다.");
}
}
