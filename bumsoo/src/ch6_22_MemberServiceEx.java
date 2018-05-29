
public class ch6_22_MemberServiceEx {
public static void main(String[]args) {
	ch6_22_MemberService MemberService = new ch6_22_MemberService();
	boolean result = MemberService.login("yourid","12345");
	if(result) {
		System.out.println("로그인되었습니다.");
		MemberService.logout("yourid");
	}else {
		System.out.println("id또는 password가 올바르지 않습니다.");
	
	}
}
}
