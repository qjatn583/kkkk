package ja0531;

public class SmartPhone extends PDA implements Phone,MPhone,MP3{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("�޼����� �����ϴ�.");
		
	}

	@Override
	public void receiveMessage() {
		// TODO Auto-generated method stub
		System.out.println("�޼����� �޽��ϴ�.");	
	}

	@Override
	public void sendcall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ���̴ϴ�.");
	}

	@Override
	public void receivecall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �޽��ϴ�.");
	}
	/*public static void main(String[]args) {
		
		MPhone mphone =new MPhone();
		MP3 mp3 = new MP3();
		MPhone.Messagesend();
		MPhone.Messagereceive();*/

	@Override
	public void MusicStart() {
		// TODO Auto-generated method stub
		System.out.println("���ǽ���.");
	}

	@Override
	public void MusicStop() {
		// TODO Auto-generated method stub
		System.out.println("��������.");
	}
		
}
