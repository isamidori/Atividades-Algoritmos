
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numeromes = 0;
        
        System.out.println("Verificação de semestre");
        System.out.println("Informe o número do mês");
        numeromes = input.nextInt();
        
        qualsemestre (numeromes);        
        
        
    }
    
    public static void qualsemestre (int numeromes){
        if ((numeromes == 1) || (numeromes == 2) || (numeromes == 3) || (numeromes == 4) || (numeromes == 5) || (numeromes == 6)){
        System.out.println("Primeiro semestre do ano");        
    }
        else if ((numeromes == 7) || (numeromes == 8) || (numeromes == 9) || (numeromes == 10) || (numeromes == 11) || (numeromes == 12)){
            System.out.println("Segundo semestre do ano");
        }
        
        else 
            System.out.println("DIgite um numero de 1 a 12");
        }
    
}
