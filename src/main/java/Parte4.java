
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        double cupom = 5;
        double valor = 0;
        
        
        System.out.println("Função de desconto");
        System.out.println("Informe o valor total da compra");
        valor = input.nextInt ();
        
        double valorfinal = calculodesconto (valor, cupom); 
        System.out.println(" O valor final da sua compra é " + valorfinal);
        System.out.println("O desconto foi de: " + cupom);
        
        
                        
    }
    
        public static double calculodesconto (double valor, double cupom){
            double valorfinal = valor - cupom;
            return valorfinal;
        
    
}
        
        
    
    
}
