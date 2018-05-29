
public class Calculator2Example {
	
	public static void main(String[] args) {
		Calculator2 i = new Calculator2();
		double result = i.areaRectangle(10);
		double result1 =i.areaRectangle(10*20); 
		System.out.println("정사각형의 넓이:"+result);
		System.out.println("직사각형의 넓이:"+result1);

	}

}
