import java.util.Scanner;

public class Parte1_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Informe o número 1");
		n1 = input.nextInt();
		System.out.println("Informe o número 2");
		n2 = input.nextInt();
		
		
		contagemNumero(n1, n2);

	}

	public static void contagemNumero (int n1, int n2) {
	for (int counter = n1 ; counter <= n2; counter = counter +n1) {
		
			System.out.println(counter);
		}
	
	

}
}

