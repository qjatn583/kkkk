package ja0604;

import java.util.*;
//Ishop인터페이스 구현 클래스
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
		User user = new User("사용자1",PayType.CARD);
		users[0]= user;
		user = new User("사용자2",PayType.CASH);
		users[1]= user;
	}

	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시s9",1000000,"SKT");
		CellPhone[] product;
		product[0]=cp;
		cp = new CellPhone("아이폰x",980000,"KT");
		SmartTV st = new SmartTV("삼성 3D SmartTV",5000000,"4k");
		product[1] =st;
		st = new SmartTV("LG",2500000,"Full HD");
		product[2] = st;
		
	}
	@Override
	public void start() {
		System.out.println(title+": 메인화면-사용자선택");
		System.out.println("=====================");
		int i =0;
		for(User u: users) {
			
			System.out.println("["+(i++)+"]"+u.getName()+u.getPayType());
		}
		System.out.println("[X] 종료");
		System.out.println("선택:");
		String sel =scan.next();
		System.out.println("##"+sel+"선택##");
		
		switch(sel) {
		case "X":System.exit(0);
		break;
		default:
			selUser= Integer.parseInt()
			productList();
		
		public void productList() {
			System.out.println(title+": 상품등록 - 상품선택");
			System.out.println("=====================");
		int i=0;
		for (Product p: products) {
			System.out.println("["+i+"]");
			p.printDatail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.println("선택:");
		String sel = scan.next();
		System.out.println("##"+sel+"선택##");
		
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
			System.out.println(title+":체크아웃");
			System.out.println("================");
			int total;
			int i=0;
			
			//장바구니에 담긴 상품 정보 출력
			for(Product p :cart) {
				System.out.println("["+(i++)+"]"+p.pName+" "+p.price);
				total= total +p.price;
			}
			System.out.println("================");
			System.out.println("결제방법:"+users[selUser].getPayType());
			System.out.println("합계:"+total+"원 입니다.");
			System.out.println("[p]이전,[q]결제완료");
			System.out.println("선택:");
			String sel = scan.next();
			
			switch(sel) {
			case"p":
				productList();
				break;
			case"q":
				System.out.println("##결제가 완료되었습니다. 종료합니다.");
				System.exit(0);
				break;
				default:
					checkOut();
			}
		}
		}
	

		
	

