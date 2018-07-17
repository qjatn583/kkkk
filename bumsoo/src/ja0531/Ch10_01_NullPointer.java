package ja0531;

public class Ch10_01_NullPointer {
	public static void main(String[]args) {
try{String data = null;
System.out.println("예외발생전......");
System.out.println(data.toString());
System.out.println("예외발생후......");
System.out.println(data);
}catch(NullPointException e) {
	System.out.println("예외가 발생했으니 코드를 확인해 볼 것");
}
}
	}