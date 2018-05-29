
public class ch6_18_Exercise {
	String name;
	int assinmentScore;
	int examScore;
	//result메소드 선언
	public void result() {
		System.out.println("이름:"+this.name);
		System.out.println("과제점수:"+this.assinmentScore);
		System.out.println("시험점수:"+this.examScore);
		System.out.println("학점:"+getGrade());
		
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
