package ja0529;

public class Ch7_09_Main extends Ch7_09_Ex{
public static void main(String[]args) {
	Ch7_09_Seden seden= new Ch7_09_Seden(100,"������");
	Ch7_09_Truck truck= new Ch7_09_Truck(50,"������",5);
	

	seden.speedUp(100);
	truck.speedUp(50);
	seden.setSeatNum(5);
	System.out.println(seden.color+"�¿����ӵ���"+seden.speed+"�̰� �¼�����"+seden.getSeatNum()+"���Դϴ�.");
	System.out.println(truck.color+"�¿����ӵ���"+truck.speed+"�̰� �¼�����"+truck.getSeatNum()+"���Դϴ�.");
/*{
	Ch7_09_Ex ex = new Ch7_09_Ex();//�θ�Ŭ���� Ÿ���� ���� ����
	Ch7_09_Ex seden=new Ch7_09_Ex(200,"�ӵ�");//seden�� �ӵ�200
	Ch7_09_Ex Truck=new Ch7_09_Ex(100,"�ӵ�");//Truck�� �ӵ� 100
	for(int i=1;i<=5;i++) {
		
		int seating =Ch7_09_Ex.run();*/
	
	
	
	
}
}}
