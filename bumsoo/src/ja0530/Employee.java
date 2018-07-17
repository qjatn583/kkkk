package ja0530;

public class Employee {
	protected String name;
	protected double salary;
	
	//생성자 선언
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	//Employee의 이름 급여정보를 가져오기위한 메소드
	public String getname() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
	public void priceincrease() {
		System.out.println(salary*1.1);
		
	}
}
