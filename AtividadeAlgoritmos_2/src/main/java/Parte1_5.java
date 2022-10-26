
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte1_5 {

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
    
        if (gastos > ganhos){
        System.out.println("Você está fora do orçamento! Não gaste mais");
        }
        
        else if (gastos < ganhos)
        System.out.println("Você está dentro do orçamento");
        
    }
        
        
}
