package bumsoo;

public class IFDice {
public static void main(String[] args) {
/*random �޼ҵ�
 * Math.random(): double�Ǽ�0.0<=1.0
 * 1~9������ ������ �߻���Ű����
 * (int)(Math.random()*10)
 * (int) Math.random()*10)
 * 1~10���� ����
 * (int) Math.random()*10)+1
 * �ζǹ�ȣ
 * (int)(Math.random()*45)+1
 */	

	/*�ֻ��� ��ȣ �̱�
	 * 1~6���� ������ �߻��ؼ�
	 * 1 �̳����� 1���� ���Խ��ϴ�.
	 * 2�� ������ 2���� ���Խ��ϴ�.
	 * ~~
	 * 6�� ������ 6���� ���Խ��ϴ�.*/
	
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
	

