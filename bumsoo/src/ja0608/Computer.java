package ja0608;

public class Computer {
int sum1(int[]values) {//sum1�̶�� �޼ҵ带 �������ִµ� �ջ��� �޼ҵ带 ���� values��� �迭�� �������ش�
	int sum  = 0;//sum�̶� ������ 0���� �ʱ�ȭ
	for(int i=0;i<values.length;i++) {//for���� �̿��ؼ� i=0,values�� ���̸�ŭ �ݺ�
		sum+=values[i];//values�� �迭�� ���� �հ�
	}
	return sum;//����� sum�� ����
}
int sum2(int...values) {//sum2�� �޼ҵ带 �������ְ� �ڵ����� �迭�� �����Ǵ�...�� �̿��Ͽ� values�迭 ����
	int sum = 0;//sum�� ������ 0���� �ʱ�ȭ
	for(int i=0;i<values.length;i++) {//for���� �̿��ϴµ� i�� 0���� �����ؼ�values�� ���̸�ŭ �ݺ�
		sum+=values[i];//values�� �迭�� ���� �հ�
	}
	return sum;//����� sum�� ����
}
}
