package ja0531;

public class CountableEx {

	public static void main(String[] args) {
		Countable[] m = {new Bird("���ٱ�"),new Bird("������"),
				new Tree("�������"),new Tree("�㳪��")};
		for(Countable e:m)
			e.count();

		for(countable e:m) {
			/*ù��° �ݺ���
			 * e=m[0]
			 * =new Bird("���ٱ�")
			 * ���ٱ⸦ �Ű������� �ϴ� Bird�� ��ü�� �����ؼ� e�� ����
			 * �ι�° �ݺ���
			 * e=m[1]
			 * =new Bird("������")
			 * �������� �Ű������� �ϴ� Bird�� ��ü�� �����ؼ� e�� ����*/
			e.count();//���ٱⰡ 2���� �ִ�.
}


		for (int i=0;i<m.length;i++) {
		//Ÿ�Կ� ���� fly�Ǵ� ripe()ȣ��=>instancedf ���
			//���ǹ��� �̿��ؼ� �迭�� ����� �� ��Ұ� BirdŬ���� Ÿ������ Ȯ��
			if(m[i]instanceof Bird) {
				((Bird)m[i]).fly();//BirdŬ���� Ÿ������ ��������ȯ�ؼ� fly()ȣ��
			}else {
				((tree)m[i]).ripe();//TreeŬ���� Ÿ������ ��������ȯ�ؼ� ripe()ȣ��
			}
				
		}
		}
}