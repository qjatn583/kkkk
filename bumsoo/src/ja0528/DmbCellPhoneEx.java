package ja0528;

public class DmbCellPhoneEx {
private static char[] model;
private static char[] color;
private static char[] channel;

public static void main(String[]args) {
	//DmbCellPhone�� ���� ��ü ����
	DmbCellPhone dmbCellphone = new DmbCellPhone("������","����",10);

	//������ ��ü�� model,color,channel���� �������
	System.out.println("��:"+dmbCellphone.model);
	System.out.println("����:"+dmbCellphone.color);
	System.out.println("ä��:"+dmbCellphone.channel);
	
	//�θ�Ŭ�������� ������ �޼ҵ� ����ȣ��
	dmbCellphone.powerOn();
	//�ڽ� Ŭ�������� ������ �޼ҵ� ���� ȣ��
	dmbCellphone.changeChannelDmb(12);
}
}
