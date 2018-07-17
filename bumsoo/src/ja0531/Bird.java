package ja0531;

public class Bird implements Countable {
String[] name;

Bird (String name){
	this.name = name;
}



@Override
public void count() {
	System.out.println(name+"가 두마리");
	
}
void fly() {
	System.out.println("2마리"+name+"이 날라간다.");
}

}