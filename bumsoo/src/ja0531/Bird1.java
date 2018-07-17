package ja0531;

public class Bird1 {
	public class Bird extends Countable1{
		String name;
		
	
Bird(String name, int num) {
	super(name,num);
	}
@Override
public void count() {
System.out.println(name+"가"+num+"그루있다.");}
void fly() {}	

}
