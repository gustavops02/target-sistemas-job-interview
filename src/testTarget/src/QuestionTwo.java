package testTarget.src;

import java.util.ArrayList;
import java.util.List;

public class QuestionTwo {

	public static List<Integer> fibonacci(int n) {
		List<Integer> fiboList = new ArrayList<>();
		
		int atual = 0;
		int ant = 0;

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				atual = 1;
				ant = 0;
				fiboList.add(atual);
			} else {
				atual += ant;
				ant = atual - ant;
				fiboList.add(atual);
			}

		}
		return fiboList;
	}
}
