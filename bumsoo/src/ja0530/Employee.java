package ja0530;

public class Employee {
	protected String name;
	protected double salary;
	
	//������ ����
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	//Employee�� �̸� �޿������� ������������ �޼ҵ�
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
