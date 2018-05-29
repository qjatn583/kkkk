package ja0529;

public class Ch7_09_HankookTire extends Tire{
	//필드
	//생성자
}
	public HankookTire(String location,int maxRotatoin) {
		super(locatoin,maxRotation);
	@Override
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"hankookTire 수명:"+
		(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire펑크***");
			return false;
		
	}
	}

}
