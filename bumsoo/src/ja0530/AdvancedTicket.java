package ja0530;

public class AdvancedTicket extends Ticket {
	private int advancedDays;//���������ϼ�
	
	public AdvancedTicket(int number,int advancedDays) {
		super(number);
		this.advancedDays= advancedDays;
		
	}
	//������� ������ ó���ϱ� ���� �޼ҵ�
	public double getPrice() {
		if(advancedDays>=30) {
			price = price*0.5;
			else if(advancedDays>=10)
				price =price*0.8;
			else if(advancedDays>=5)
				price =price*0.9;
			return price;
		}
	}
	/*private String ticketing;
	private int ticketnumber;
	private int ticketinginformation;
	public AdvancedTicket(String ticketing, int ticketnumber, int price) {
		super(ticketing, ticketnumber, price);
		
	}
	
	public String getticketing() {
		return ticketing;
	}

	public void setticketingm(String ticketing) {
		this.ticketing = ticketing;
	
int day = 0;
if(day<30) {
	System.out.println(price/2+"��");
	if(day<10) {
		System.out.println(price/5+"��");
		if(day<5) {
			System.out.println(price/9+"��");
		}
	}
	
}
}*/
}