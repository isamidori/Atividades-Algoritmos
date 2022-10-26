import java.util.Scanner;

public class Parte3_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("Programa da Tabuada");
		
		System.out.println("Informe um número");
		numero = input.nextInt();
		
		
		int[] verFinal = verArray(numero);
		
		for(int counter:verFinal) {
			System.out.println	(counter);
			
		}
		
	}
	
	public static int[] verArray (int numero) {
	int[] tabuada = new int[11];
	
	
	for(int counter=0 ; counter < 11 ; counter++) {
		tabuada[counter] = numero * counter;
	}
	
	return tabuada;
	}
	
	

}
