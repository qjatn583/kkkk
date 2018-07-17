package ja0611;

public class Tv {
static String company = "Samsung";//객체를 생성하지 않을 company에 Samsung이라는 정보를 대입
static String model="LCD";//객체를 생성하지 않을 model에 LCD라는 정보를 대입
static String info;//객체를 생성하지 않을 info 생성

static {
	info = company+"-"+model;//info안에 company+"-"+model정보 대입
}
}
