
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte3_11 {

	/**
	 * @param args the command line arguments
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programa do Triangulo");
		System.out.println("Informe a medida do lado 1");
		int medida1 = input.nextInt();
		System.out.println("Informe a medida do lado 2");
		int medida2 = input.nextInt();
		System.out.println("Informe a medida do lado 3");
		int medida3 = input.nextInt();

		String recebe = "";

		recebe = verificaTriangulo(medida1, medida2, medida3);

		System.out.println("O triangulo é" + recebe);
	}

	public static String verificaTriangulo(int medida1, int medida2, int medida3) {

		String resultado = "";

		if ((medida1 == medida2) && (medida2 == medida3) && (medida3 == medida1)) {
			resultado = "Equilatero";

		}

		else if ((medida1 != medida2) && (medida2 != medida3) && (medida3 != medida1)) {
			resultado = "Escaleno";

		}

		else {
			resultado = "Isoceles";

		}

		return resultado;

	}

}
