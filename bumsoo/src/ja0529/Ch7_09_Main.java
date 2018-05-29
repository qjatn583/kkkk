package ja0529;

public class Ch7_09_Main extends Ch7_09_Ex{
public static void main(String[]args) {
	Ch7_09_Seden seden= new Ch7_09_Seden(100,"빨간색");
	Ch7_09_Truck truck= new Ch7_09_Truck(50,"검정색",5);
	

	seden.speedUp(100);
	truck.speedUp(50);
	seden.setSeatNum(5);
	System.out.println(seden.color+"승용차속도는"+seden.speed+"이고 좌석수는"+seden.getSeatNum()+"개입니다.");
	System.out.println(truck.color+"승용차속도는"+truck.speed+"이고 좌석수는"+truck.getSeatNum()+"개입니다.");
/*{
	Ch7_09_Ex ex = new Ch7_09_Ex();//부모클래스 타입의 변수 선언
	Ch7_09_Ex seden=new Ch7_09_Ex(200,"속도");//seden의 속도200
	Ch7_09_Ex Truck=new Ch7_09_Ex(100,"속도");//Truck의 속도 100
	for(int i=1;i<=5;i++) {
		
		int seating =Ch7_09_Ex.run();*/
	
	
	
	
}
}}
