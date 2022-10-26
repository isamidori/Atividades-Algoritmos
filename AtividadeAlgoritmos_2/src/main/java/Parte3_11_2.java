
import java.util.Scanner;



 class Parte3_11_2 {

   
    public static void main(String[] args) {   
        
    
    Scanner input = new Scanner (System.in);
   
    int dia;
    int mes;
    int ano;
        
    
    System.out.println("Digite o dia ");
    dia = input.nextInt();
    System.out.println("Digite o mês ");
    mes = input.nextInt();
    System.out.println("Digite o ano ");
    ano = input.nextInt();
    
    String validacaoFinal = verificarMes (dia, mes, ano);
    System.out.println("A data é " + validacaoFinal);
    
    
    
    }
    
    public static String verificarMes (int dia, int mes, int ano){
        
    
        String dataFinal = "";
   
        if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) && ((dia >= 1) && (dia < 32))) {
  
            dataFinal = ("A data" + dia + mes + ano + "é válida");

         }

        else if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && ((dia >= 1) && (dia < 31))) {
        
            dataFinal = ("A data" + dia + mes + ano + "é válida");

        }

        else if ((mes == 2) && ((dia > 0) && (dia <= 28))){
              
            dataFinal = ("A data" + dia + mes + ano + "é válida");
          
        }

        else{
        
            dataFinal = "Inválido";

        }

          return dataFinal;
}

        }
