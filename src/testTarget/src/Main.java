package testTarget.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* QUESTÃO 2 */
	

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um numero: ");
		int num = sc.nextInt();
				
		List<Integer> fibo = QuestionTwo.fibonacci(num);
		System.out.println(fibo);
		if(fibo.contains(num)) {
			System.out.println("O seu numero pertence à sequencia");
		} else {
			System.out.println("O seu numero não pertence à sequencia");

		}

		/*  Questão 5  */
		
		String word = "Gustavo Paulo";
		System.out.println(StringQuestion.reverseString(word));

	}

}
