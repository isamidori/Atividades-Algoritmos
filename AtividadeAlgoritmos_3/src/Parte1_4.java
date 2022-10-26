import java.util.Scanner;

public class Parte1_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int condInicio = 0;
		int condFim = 0;

		System.out.println("Contado de um número até outro");
		System.out.println("Informe o número inicial");
		condInicio = input.nextInt();
		System.out.println("Informe o número final");
		condFim = input.nextInt();

		contagemNumeros(condInicio, condFim);

	}

	public static void contagemNumeros(int condInicio, int condFim) {
		for (int counter = condInicio; counter <= condFim; counter++) {
			System.out.println(counter);
		}

	}

}