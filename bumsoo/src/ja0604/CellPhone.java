package ja0604;

public class CellPhone {
String carrier;
public CellPhone(String string, int i, String string2) {
	// TODO Auto-generated constructor stub
}
public Cellphone(String pName, int price,String carrier) {
	this.pName = pName;
	this.price = price;
	this.carrier= carrier;
}
	@Override
	public void printExtra() {
		System.out.println("Ελ½Ε»η:"+carrier);
	}
}
