
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        double ganhos = 0.0;
        double gastos = 0.0;        
        
        System.out.println("Programa do orçamento");
        System.out.println("Informe o total de ganhos");
        ganhos = input.nextDouble();
        System.out.println("Informe o total de gastos");
        gastos = input.nextDouble();
        
        
        orcamento (ganhos, gastos);
        
        
        
    }
    
    public static void orcamento (double ganhos, double gastos){
        double percentual = 100 * gastos / ganhos;
                
       if (percentual < 30){
           System.out.println("Parabéns, está gerenciando bem seu orçamento!");
       }
       
       else if (percentual < 50){
           System.out.println("Muito bem, seus gastos não ultrapassam metade dos ganhos");
           
       }
       
       else if (percentual < 80){
        System.out.println("Atenção, melhor conter os gastos!");
    }
       else if (percentual < 100){
           System.out.println("Cuidado, seu orçamento pode ficar comprometido");
       }
       else if (percentual > 100){
           System.out.println("Orçamento comprometido! Hora de rever seus gastos!");
       }
       else 
            System.out.println("Invalido");
  
        
        
}
    
}
