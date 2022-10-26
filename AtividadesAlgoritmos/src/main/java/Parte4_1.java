
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
   
        float percentage = 10;
        float valor = 0;
        
        
        System.out.println("Função de desconto");
        System.out.println("Informe o valor total da compra");
        valor = input.nextInt ();
        
        double valorfinal = calculodesconto (percentage, valor); 
        System.out.println(" O valor final da sua compra é " + valorfinal);
        System.out.println("O desconto foi de: " + percentage + "%");
        
        
                        
    }
    
        public static double calculodesconto (float percentage, float valor){
            double valorfinal = valor * percentage;
            valorfinal = valorfinal / 100;
            return valorfinal;
        
    
}
        
        
    
    
}
