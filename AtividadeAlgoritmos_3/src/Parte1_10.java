import java.util.Scanner;

public class Parte1_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n1 = 0;
		
		System.out.println("Informe N1");
		n1 = input.nextInt();
		
		numerosemDobro (n1);
	
		

	}
	
	public static void numerosemDobro(int n1) {
		for (int counter = 1 ; counter <= n1 ; counter *= 2) {
			System.out.println("O dobro de " + counter + " é " + counter * 2);
			}
		
	}

}
