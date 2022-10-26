
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Implementar uma função para calcular o total de uma venda de açai a partir das qtds compradas para cada tamanho: pequeno, médio e grande, sabendo que o valor do açai é R$ 13,50, R$ 15,00 e R$ 17,50 respectivamente.

/**
 *
 * @author isabe
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int pequeno = 0;
        int medio = 0;
        int grande = 0;
        double valorpeq = 13.50;
        double valormed = 15.00;
        double valorgra = 17.50;
        
        System.out.println("Programa venda de açai");
        
        System.out.println("Quantos açai pequeno você deseja comprar?");
        pequeno = input.nextInt();
        
        System.out.println("Quantos açai médio você deseja comprar?");
        medio = input.nextInt();
        
        System.out.println("Quantos açai grande você deseja comprar?");
        grande = input.nextInt();
        
        
        
        double soma = calculofinal (pequeno, medio, grande, valorpeq, valormed, valorgra);
        System.out.println("O valor final é " + soma);

    }
                      
    
    
    public static double calculofinal (int pequeno, int medio, int grande, double valorpeq, double valormed, double valorgra){
        
        double contapeq = pequeno * valorpeq;      
        double contamed = medio * valormed;
        double contagra = grande * valorgra;
                
        double soma = contapeq + contamed + contagra;
        return soma;
       
    }
    
}

    


        
    
    






 