package ja0605;

public class ArrayReferenceobjectExample {
public static void main(String[]args) {
	String[]strArray = new String[3];//String������ strArray�� new String[3]�� ����
	strArray[0] = "Java";//strArray[0]�� java����
	strArray[1] = "Java";//strArray[1]�� java����
	strArray[2] =new String("Java");//���ο� ��ü�� java�� ������ strArray[2]�� ����
	
	System.out.println(strArray[0]==strArray[1]);//strArray[0]�� strArray[1]�� ���� ��� true�� ���´�
	System.out.println(strArray[0]==strArray[2]);//strArray[0]�� strArray[2]�� ���� ��� false�� ���´�
	System.out.println(strArray[0].equals(strArray[2]));//equals�� �̿��� ���߱� ������ true�� ���´�
	
			}
}
