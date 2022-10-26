import java.util.Scanner;

public class Parte3_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condFim = 0;
		
		
		System.out.println("Programa soma dos naturais - fatorial");
		System.out.println("Informe o número limite");
		condFim = input.nextInt();
	
		
		
		int fatorial = fatorarNaturais (condFim);
		
		System.out.println("O fatorial é: " + fatorial);
	}
	
	
	
	public static int fatorarNaturais (int condFim) {
		int fatorial = 1;
		
		for (int counter = 1; counter <= condFim; counter ++ ) {
			fatorial = fatorial * counter;
		}
		
		return fatorial;
		
	}

}
