package ja0604;

public class ShopLauncher {
//쇼핑몰을 실행하기 위한 메소드 클래스
	public static void main(String[]args) {
		IShop shop = newShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}
}
