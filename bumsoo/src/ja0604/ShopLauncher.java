package ja0604;

public class ShopLauncher {
//���θ��� �����ϱ� ���� �޼ҵ� Ŭ����
	public static void main(String[]args) {
		IShop shop = newShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}
}
