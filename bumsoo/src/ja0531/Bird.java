package ja0531;

public class Bird implements Countable {
String[] name;

Bird (String name){
	this.name = name;
}



@Override
public void count() {
	System.out.println(name+"�� �θ���");
	
}
void fly() {
	System.out.println("2����"+name+"�� ���󰣴�.");
}

}