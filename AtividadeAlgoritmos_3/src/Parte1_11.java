import java.util.Scanner;

public class Parte1_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("Programa da tabuada");
		System.out.println("Informe um número");
		numero = input.nextInt();
		
		tabuada (numero);

	}
	
	
	public static void tabuada(int numero) {
		for (int counter = 1; counter <= 10; counter ++) {
			System.out.println(numero + "X" + counter + "=" + counter * numero);
		}
	}

}
