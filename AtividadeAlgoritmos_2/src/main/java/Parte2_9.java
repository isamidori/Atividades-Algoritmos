
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numerojog1 = 0;
        int numerojog2 = 0;
        int soma = 0;
        
        System.out.println("Programa par ou impar");
        System.out.println("Informe o numero que o jogador 1 jogou");
        numerojog1 = input.nextInt();
        System.out.println("Informe o numero que o jogador 2 jogou");
        numerojog2 = input.nextInt ();
        
        ganhador (numerojog1, numerojog2);
        
    }
    
    public static void ganhador (int numerojog1, int numerojog2){
        
       int soma = numerojog1 + numerojog2;
       
       
       if (soma % 2 == 0){
        System.out.println("Jogandor 1 ganhou");
       }
           
       else if (soma % 2 == 1){
        System.out.println("Jogador 2 ganhou");
       }
       
       else{ 
        System.out.println("Inválido");
       }
           
          
    }
    
    
}
    

