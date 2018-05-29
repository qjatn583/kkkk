package bumsoo;

public class IFDice {
public static void main(String[] args) {
/*random 메소드
 * Math.random(): double실수0.0<=1.0
 * 1~9까지의 난수를 발생시키려면
 * (int)(Math.random()*10)
 * (int) Math.random()*10)
 * 1~10까지 난수
 * (int) Math.random()*10)+1
 * 로또번호
 * (int)(Math.random()*45)+1
 */	

	/*주사위 번호 뽑기
	 * 1~6까지 난수를 발생해서
	 * 1 이나오면 1번이 나왔습니다.
	 * 2가 나오면 2번이 나왔습니다.
	 * ~~
	 * 6이 나오면 6번이 나왔습니다.*/
	
	int num = (int)(Math.random()*6)+1;
	
	if(num==1) {
		System.out.println("1");
	}
	else if(num==2) {
		System.out.println("2"); }
		else if(num==3) {
			System.out.println("3"); }
		else if(num==4 ) {
			System.out.println("4"); }
		else if(num==5 ) {
			System.out.println("5"); }
		else {
			System.out.println("6"); }
	
		
	}
}
	

