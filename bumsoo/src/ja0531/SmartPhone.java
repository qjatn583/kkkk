package ja0531;

public class SmartPhone extends PDA implements Phone,MPhone,MP3{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("메세지를 보냅니다.");
		
	}

	@Override
	public void receiveMessage() {
		// TODO Auto-generated method stub
		System.out.println("메세지를 받습니다.");	
	}

	@Override
	public void sendcall() {
		// TODO Auto-generated method stub
		System.out.println("전화를겁니다.");
	}

	@Override
	public void receivecall() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받습니다.");
	}
	/*public static void main(String[]args) {
		
		MPhone mphone =new MPhone();
		MP3 mp3 = new MP3();
		MPhone.Messagesend();
		MPhone.Messagereceive();*/

	@Override
	public void MusicStart() {
		// TODO Auto-generated method stub
		System.out.println("음악시작.");
	}

	@Override
	public void MusicStop() {
		// TODO Auto-generated method stub
		System.out.println("음악종료.");
	}
		
}
