package ja0604;

import java.util.*;
//Ishop�������̽� ���� Ŭ����
public class Myshop<SmartTV> implements IShop{
	User[]users = new User[2];
	Product[]products = new Product[4];
	ArrayList<Product>cart = new ArrayList<Product>();
	Scanner scan = new Scanner(System.in);
	int selUser;
	String title;
	
	@Override
	public void setTitle(String title) {
		this.title = title;
		
	}

	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		User user = new User("�����1",PayType.CARD);
		users[0]= user;
		user = new User("�����2",PayType.CASH);
		users[1]= user;
	}

	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("������s9",1000000,"SKT");
		CellPhone[] product;
		product[0]=cp;
		cp = new CellPhone("������x",980000,"KT");
		SmartTV st = new SmartTV("�Ｚ 3D SmartTV",5000000,"4k");
		product[1] =st;
		st = new SmartTV("LG",2500000,"Full HD");
		product[2] = st;
		
	}
	@Override
	public void start() {
		System.out.println(title+": ����ȭ��-����ڼ���");
		System.out.println("=====================");
		int i =0;
		for(User u: users) {
			
			System.out.println("["+(i++)+"]"+u.getName()+u.getPayType());
		}
		System.out.println("[X] ����");
		System.out.println("����:");
		String sel =scan.next();
		System.out.println("##"+sel+"����##");
		
		switch(sel) {
		case "X":System.exit(0);
		break;
		default:
			selUser= Integer.parseInt()
			productList();
		
		public void productList() {
			System.out.println(title+": ��ǰ��� - ��ǰ����");
			System.out.println("=====================");
		int i=0;
		for (Product p: products) {
			System.out.println("["+i+"]");
			p.printDatail();
			i++;
		}
		System.out.println("[h]����ȭ��");
		System.out.println("[c]üũ�ƿ�");
		System.out.println("����:");
		String sel = scan.next();
		System.out.println("##"+sel+"����##");
		
		switch(sel) {
		case"h":
			start();
			break;
		case"c":
		checkOut();
		break;
		default:
			int pse1 = Integer.parseInt(sel);
			cart.add(products[pse1]);
			productList();
			
		}
		}
		public void checkOut() {
			System.out.println(title+":üũ�ƿ�");
			System.out.println("================");
			int total;
			int i=0;
			
			//��ٱ��Ͽ� ��� ��ǰ ���� ���
			for(Product p :cart) {
				System.out.println("["+(i++)+"]"+p.pName+" "+p.price);
				total= total +p.price;
			}
			System.out.println("================");
			System.out.println("�������:"+users[selUser].getPayType());
			System.out.println("�հ�:"+total+"�� �Դϴ�.");
			System.out.println("[p]����,[q]�����Ϸ�");
			System.out.println("����:");
			String sel = scan.next();
			
			switch(sel) {
			case"p":
				productList();
				break;
			case"q":
				System.out.println("##������ �Ϸ�Ǿ����ϴ�. �����մϴ�.");
				System.exit(0);
				break;
				default:
					checkOut();
			}
		}
		}
	

		
	

