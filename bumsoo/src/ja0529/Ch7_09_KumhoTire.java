package ja0529;

public class Ch7_09_KumhoTire extends Tire{
	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	@override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire ����:"+
		(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire��ũ***");
			return false;

}
