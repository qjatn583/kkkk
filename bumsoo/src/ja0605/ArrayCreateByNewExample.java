package ja0605;

public class ArrayCreateByNewExample {
public static void main(String[]args) {
	int[]arr1=new int[3];//������ arr1�� new�����ڸ� �̿��ؼ� 3���� �迭�� �������ش�
	for(int i=0;i<3;i++) {//for���� �̿��� ������i��0���μ����ϰ�0,1,2�ݺ�
		System.out.println("arr1["+i+"]:"+arr1[i]);//arr1[i]:i ȣ��
		}
	arr1[0] = 10;//arr1[0]�� 10���� ����
	arr1[1] = 20;//arr1[1]�� 20���� ����
	arr1[2] = 30;//arr1[2]�� 30���� ����
	for(int i=0;i<3;i++) {//for���� �̿��� ������i��0���μ����ϰ�0,1,2�ݺ�
		System.out.println("arr1["+i+"]:"+arr1[i]);//������ ��������arr1[i]=arr1[i]ȣ��
	}
	double[]arr2=new double[3];//�Ǽ��� �迭arr2�� new�����ڸ� �̿��� �Ǽ��� �迭 3�� ����
	for(int i=0;i<3;i++) {//for���� �̿��� ����i�� 0���� 0,1,2 �ݺ����ش�
		
		
		
	}
}
}
