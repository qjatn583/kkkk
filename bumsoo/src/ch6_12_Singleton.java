
public class ch6_12_Singleton {
private static ch6_12_Singleton singLeton= new ch6_12_Singleton();
private ch6_12_Singleton() {
	
}
static ch6_12_Singleton getInstance(){
	return singLeton;
}
}
