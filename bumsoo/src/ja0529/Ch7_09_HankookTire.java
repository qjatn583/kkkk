package ja0529;

public class Ch7_09_HankookTire extends Tire{
	//�ʵ�
	//������
}
	public HankookTire(String location,int maxRotatoin) {
		super(locatoin,maxRotation);
	@Override
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"hankookTire ����:"+
		(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire��ũ***");
			return false;
		
	}
	}

}
