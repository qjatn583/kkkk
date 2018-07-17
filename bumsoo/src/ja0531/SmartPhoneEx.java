package ja0531;

public class SmartPhoneEx {
public static void main(String[]args) {
	SmartPhone sp = new SmartPhone();
	sp.sendcall();
	sp.receivecall();
	sp.sendcall();
	sp.receiveMessage();
	sp.MusicStart();
	sp.MusicStop();
	System.out.println(sp.plus(3, 5));
}
}
