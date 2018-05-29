package ja0528;

public class DmbCellPhoneEx {
private static char[] model;
private static char[] color;
private static char[] channel;

public static void main(String[]args) {
	//DmbCellPhone에 대한 객체 생성
	DmbCellPhone dmbCellphone = new DmbCellPhone("갤럭시","검정",10);

	//생성한 객체의 model,color,channel값을 각각출력
	System.out.println("모델:"+dmbCellphone.model);
	System.out.println("색상:"+dmbCellphone.color);
	System.out.println("채널:"+dmbCellphone.channel);
	
	//부모클래스에서 선언한 메소드 각각호출
	dmbCellphone.powerOn();
	//자식 클래스에서 선언한 메소드 각각 호출
	dmbCellphone.changeChannelDmb(12);
}
}
