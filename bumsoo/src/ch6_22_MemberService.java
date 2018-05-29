
public class ch6_22_MemberService {
 private String id; 
 private String password; 
 

 public boolean login(String id,String password) { 
	 if(id=="yourid"&&password=="12345"){
		 System.out.println("로그인되었습니다.");
		 return true;
		 
	 }else {
		 return false;
	 }
	 }
	 public void logout(String id) {
		System.out.println("로그아웃되었습니다.");
 }
 
 
}
