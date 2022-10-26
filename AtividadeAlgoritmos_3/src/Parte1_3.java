import java.util.Scanner;

public class Parte1_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condContador = 0;
		
		
		System.out.println("Contagem de números impares");
		System.out.println("Informe um número");
		condContador = input.nextInt();
		
			contagemImpar (condContador);

	}
	
	
	
	
	public static void contagemImpar (int condContador) {
		for (int counter = 0 ; counter <= condContador; counter ++) {
			if (counter %2 == 1)
			System.out.println(counter);
		}
	}

}
