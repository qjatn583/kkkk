package ja0531;
import java.util.Calendar;

public class Ch11_06_CalenderEx {


public static void main(String[]args) {
	Calendar now = Calendar.getInstance();
	
	int year = now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH)+1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK);
	int hour = now.get(Calendar.HOUR);
	System.out.println(year);

}
}
