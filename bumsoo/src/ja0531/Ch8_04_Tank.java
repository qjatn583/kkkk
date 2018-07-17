package ja0531;

public class Ch8_04_Tank implements Ch8_04_Car,Ch8_04_Canon{

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 대포를 발사합니다.");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 앞으로 전진합니다.");
	}

}
