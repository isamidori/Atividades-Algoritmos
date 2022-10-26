import java.util.Scanner;

public class Parte4_14 {

	
	public static void main(String[] args) { 
		Scanner input = new Scanner (System.in);
		double vint = 28.5;
		double vmei = 14.25;
		int nac = 5;
		int qtdint = 0;
		int qtdmei = 0;
		String dia = "";
		String fnac = "";
		
		System.out.println("Programa do cinema");
		System.out.println("Informe quantos ingressos interos: ");
		qtdint = input.nextInt();
		System.out.println("Informe quantos ingressos meia: ");
		qtdmei = input.nextInt();
		System.out.println("Informe o dia");
		dia = input.next();
		System.out.println("O filme é nacional? ");
		fnac = input.next();
		
		
		double vf = calculoIngresso (vint, vmei, nac, qtdint, qtdmei, dia, fnac);
		System.out.println("O valor final é " + vf);
		
		
	}
	

	
	public static double calculoIngresso (double vint, double vmei, int nac, int qtdint, int qtdmei, String dia, String fnac) {
		double vfmeia = 0.0;
		double vfint = 0.0;
		double valorfinal = 0.0;
		
		vfmeia = vmei * qtdmei;
		
		if (fnac.equals("sim")) {
			vfint = qtdint * nac;
		}

		else if (((dia.equals("segunda")) || (dia.equals("terça")) || (dia.equals("quinta")) || (dia.equals ("sexta")) || (dia.equals ("sabado")) || (dia.equals ("domingo")))) {
		vfint = qtdint * vint;
		}
		
		else if (dia.equals("quarta")){ 
		vfint = qtdint * vmei;
		} 
		
		
		else {
		vfint = 0;
		}
		
		return valorfinal = vfmeia + vfint;
				
	}
	
}
