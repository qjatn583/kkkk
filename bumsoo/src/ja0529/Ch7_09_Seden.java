package ja0529;

public class Ch7_09_Seden extends Ch7_09_Ex{

		
	

	private int seatNum;
	public Ch7_09_Seden(int speed, String color) {
		super(speed, color);

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	}
	/*public String seating;
	@Override
	public boolean speed1() {
		++speed;
		if(speed>0) {
			System.out.println();}
		--speed;
		if(speed<0) {
			System.out.println();
		}
		return false;*/
}
}