
public class ch6_22_MemberServiceEx {
public static void main(String[]args) {
	ch6_22_MemberService MemberService = new ch6_22_MemberService();
	boolean result = MemberService.login("yourid","12345");
	if(result) {
		System.out.println("�α��εǾ����ϴ�.");
		MemberService.logout("yourid");
	}else {
		System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
	
	}
}
}
