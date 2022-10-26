import java.util.Scanner;

public class Parte3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condFim = 0;
		
		System.out.println("Programa soma dos naturais impares");
		System.out.println("Informe o número limite");
		condFim = input.nextInt();
		
		
		int x = somaNaturaisImpar (condFim);
		
		System.out.println("A soma é: " + x);
	}
	
	
	
	public static int somaNaturaisImpar (int condFim) {
		int soma = 0;
		
		for (int counter = 1; counter <= condFim; counter ++ ){
			if(counter %2 == 1) {
			soma += counter;
		}
		}
		return soma;
		
	}

}
