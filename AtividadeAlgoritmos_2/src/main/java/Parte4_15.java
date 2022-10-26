import java.util.Scanner;

public class Parte4_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cor1 = "";
		String cor2 = "";

		System.out.println("Programa das cores");
		System.out.println("Informe a primeira cor primaria");
		cor1 = input.next();
		System.out.println("Informe a segunda cor primaria ");
		cor2 = input.next();

		String resultado = misturaCor(cor1, cor2);
		System.out.println(resultado);

	}

	public static String misturaCor(String cor1, String cor2) {

		String corfinal = ";";

		if (((cor1.equals("azul")) && (cor2.equals("amarelo"))) || (cor1.equals("amarelo")) && (cor2.equals("azul"))) {
			corfinal = "verde";
		}

		else if ((((cor1.equals("amarelo")) && (cor2.equals("vermelho")))
				|| (cor1.equals("vermelho")) && (cor2.equals("amarelo")))) {
			corfinal = "laranja";
		}

		else if ((((cor1.equals("vermelho")) && (cor2.equals("azul")))
				|| (cor1.equals("azul")) && (cor2.equals("vermelho")))) {
			corfinal = "lilas";
		}

		else if (((!cor1.equals("vermelho")) && (!cor1.equals("verde")) || (!cor1.equals("azul")))
				&& ((!cor2.equals("vermelho")) || (!cor2.equals("verde")) || (!cor2.equals("azul")))) {
			corfinal = "Apenas cores primárias são aceitas";
		}

		else {
			corfinal = "Invalido";
		}

		return corfinal;

	}

}
