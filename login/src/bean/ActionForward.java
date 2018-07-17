package bean;

//dispatch or redirect 방식으로 포워딩을 하기 위해 
//규격을 정의하는 클래스 
public class ActionForward {
	//private boolean isRedirect = false;
	private String path = null;
	private boolean redirect = false;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	
	
	
	
	
	
	
}
