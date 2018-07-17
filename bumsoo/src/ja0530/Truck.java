package ja0530;

public class Truck extends Car{
	private String kind;
	public void Car () {
		this.kind = "트럭";
	}
	@Override
	public void kind() {
		
		System.out.println("짐을 실습니다.");
}
}
