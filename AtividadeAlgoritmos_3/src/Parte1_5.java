import java.util.Scanner;

public class Parte1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condContinuacao = 0;
		
		System.out.println("Programa da contagem reversa");
		System.out.println("Informe um número");
		condContinuacao = input.nextInt();

		contagemNumeros (condContinuacao);

		
	}

	
	public static void contagemNumeros (int condContinuacao) {
		for (int counter = condContinuacao ; counter >= 1 ; counter--) {
			System.out.println(counter);
		}
	}
}
