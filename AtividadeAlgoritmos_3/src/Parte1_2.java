import java.util.Scanner;

public class Parte1_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int condContinuacao = 0;

		System.out.println("Contador de números pares");
		System.out.println("Informe um número");
		condContinuacao = input.nextInt();

		contadorPar (condContinuacao);
		
	}

public static void contadorPar (int condContinuacao) {
	for (int counter = 1; counter <= condContinuacao; counter ++ ) {
		if (counter %2 == 0)
		System.out.println(counter);
	}
}

}
