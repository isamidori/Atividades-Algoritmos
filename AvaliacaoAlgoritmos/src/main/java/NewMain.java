import java.util.Scanner;

public class NewMain {


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condInicio = 0;
		int condFim = 0;
		
		contagemNumero (condInicio, condFim);
		
	}
	
	public static void contagemNumero(int condInicio, int condFim) {
		for (int counter = condInicio; counter >= condFim ; counter--) {
			if (counter %2 == 1) {
				System.out.println(counter);
			}
		}
	}
}
