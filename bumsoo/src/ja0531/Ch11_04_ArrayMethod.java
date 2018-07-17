package ja0531;

import java.util.Arrays;
import java.util.Collections;

public class Ch11_04_ArrayMethod {
public static void main(String[]args) {
	/*int[]score = {100,80,90};*/
	String[]score = {"가나다","하하","마바사"};
	for(int i=0;i<score.length;i++) {
		System.out.println(score[i]);
		
	}

	System.out.println();
	Arrays.sort(score);
	for(int i=0;i<score.length;i++) {
		System.out.println(score[i]);
}
	System.out.println();
	Arrays.sort(score,Collections.reverseOrder());
	for(int i=0;i<score.length;i++) {
		System.out.println(score[i]);
}
}
}