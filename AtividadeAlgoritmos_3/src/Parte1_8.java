import java.util.Scanner;

public class Parte1_8 {


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condInicio = 0;
		int condFim = 0;
		
		System.out.println("Programa de um numero impar até outro");
		System.out.println("Informe o número inicial");
		condInicio = input.nextInt();
		System.out.println("Informe o número final");
		condFim = input.nextInt();
		
		
		contagemNumero (condInicio, condFim);
		
	}
	
	public static void contagemNumero(int condInicio, int condFim) {
		for (int counter = condInicio; counter >= condFim ; counter--) {
				System.out.println(counter);
			}
		}
	}

