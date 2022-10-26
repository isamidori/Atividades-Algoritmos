import java.util.Scanner;

public class Parte4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double inteira = 28.50;
		double meia = 14.25;
		String dia = "";
		int qtdint = 0;
		int qtdmeia = 0;

		System.out.println("Programa do cinema");
		System.out.println("Quantos entradas inteiras? ");
		qtdint = input.nextInt();
		System.out.println("Quantas meia entradas? ");
		qtdmeia = input.nextInt();
		System.out.println("Qual o dia da semana? ");
		dia = input.next();

		double valorfinal = calculovalor(inteira, meia, dia, qtdint, qtdmeia);
		System.out.println("O valor final é: " + valorfinal);

	}

	public static double calculovalor(double inteira, double meia, String dia, int qtdint, int qtdmeia) {

		double vfint = 0.0;
		double vfmeia = 0.0;
		double valorfinal = 0.0;

		vfmeia = qtdmeia * meia;

		if (((dia.equals("segunda")) || (dia.equals("terça")) || (dia.equals("quinta")) || (dia.equals("sexta"))
				|| (dia.equals("sabado")) || (dia.equals("domingo")))) {
			vfint = qtdint * inteira;
		}

		else if (dia.equals("quarta")) {
			vfint = qtdint * meia;
		}

		else {
			vfint = 0;
		}

		return valorfinal = vfmeia + vfint;

	}

}
