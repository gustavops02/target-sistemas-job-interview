package testTarget.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* QUESTÃO 1 */
		// Ao final do processamento, o valor será 91.
		// Isso se deve por causa de sua atribuição a cada iteração no while.
		// a variável receberá ela mesma + a variavel K a cada iteração, chegando no
		// valor de 91.

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

				
		

	}

}
