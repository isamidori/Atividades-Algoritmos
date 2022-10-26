import java.util.Scanner;

public class Parte3_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condFim = 0;
		
		System.out.println("Programa soma dos naturais pares");
		System.out.println("Informe o número limite");
		condFim = input.nextInt();
		
		
		int x = somaNaturaisPares (condFim);
		
		System.out.println("A soma é: " + x);
	}
	
	
	
	public static int somaNaturaisPares (int condFim) {
		int soma = 0;
		
		for (int counter = 1; counter <= condFim; counter ++ ){
			if(counter %2 == 0) {
			soma += counter;
		}
		}
		return soma;
		
	}

}
