import java.util.Scanner;

public class Parte3_12 {

	public static void main(String[] args) {   
		Scanner input = new Scanner (System.in);
		String op = "";
		int n1 = 0;
		int n2 = 0;
		
		
		System.out.println("Calculadora");
		System.out.println("Qual operação você vai fazer? Digite + OU - OU / OU *");
		op = input.next();
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo número: ");;
		n2 = input.nextInt();
		
		
		int resultadoFinal = operacao (op, n1, n2);
		System.out.println("O resultado é " + resultadoFinal );
		
		
	}
	
	
	public static int operacao (String op, int n1, int n2) {
		int resultado = 0;
		
		if (op.equals("+")) {
			resultado = n1 + n2;
		}
	
		else if (op.equals("-")) {
			resultado = n1 - n2;
		}	
		else if (op.equals("*")) {
			resultado = n1 * n2;
		}
		else if (op.equals("/")) {
			resultado = n1 / n2;
		}
		else {
			System.exit(resultado);
			
		}
		return resultado;
		
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	

