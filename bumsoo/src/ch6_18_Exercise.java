
public class ch6_18_Exercise {
	String name;
	int assinmentScore;
	int examScore;
	//result�޼ҵ� ����
	public void result() {
		System.out.println("�̸�:"+this.name);
		System.out.println("��������:"+this.assinmentScore);
		System.out.println("��������:"+this.examScore);
		System.out.println("����:"+getGrade());
		
	}
	public String getGrade() {
		String grade;
		double avg;
		avg=(this.assinmentScore+this.examScore)/2;
		if(avg>=90) {
			grade="A";
		}else if(avg>=80) {
			grade="B";
		}else {
			grade="F";
			
		}
		return grade;
	}
}
