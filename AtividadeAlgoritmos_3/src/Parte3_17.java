import java.util.Scanner;

public class Parte3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condFim = 0;
		
		System.out.println("Programa soma dos naturais");
		System.out.println("Informe o número limite");
		condFim = input.nextInt();
		
		
		int x = somaNaturais (condFim);
		
		System.out.println("A soma é: " + x);
	}
	
	
	
	public static int somaNaturais (int condFim) {
		int soma = 0;
		
		for (int counter = 1; counter <= condFim; counter ++ ){
			soma += counter;
		}
		
		return soma;
		
	}

}
