package ja0531;

public class CountableEx {

	public static void main(String[] args) {
		Countable[] m = {new Bird("뻐꾸기"),new Bird("독수리"),
				new Tree("사과나무"),new Tree("밤나무")};
		for(Countable e:m)
			e.count();

		for(countable e:m) {
			/*첫번째 반복문
			 * e=m[0]
			 * =new Bird("뻐꾸기")
			 * 뻐꾸기를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입
			 * 두번째 반복문
			 * e=m[1]
			 * =new Bird("독수리")
			 * 독수리를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입*/
			e.count();//뻐꾸기가 2마리 있다.
}


		for (int i=0;i<m.length;i++) {
		//타입에 따라 fly또는 ripe()호출=>instancedf 사용
			//조건문을 이용해서 배열에 저장된 각 요소가 Bird클래스 타입인지 확인
			if(m[i]instanceof Bird) {
				((Bird)m[i]).fly();//Bird클래스 타입으로 강제형변환해서 fly()호출
			}else {
				((tree)m[i]).ripe();//Tree클래스 타입으로 강제형변환해서 ripe()호출
			}
				
		}
		}
}