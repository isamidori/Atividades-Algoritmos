
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int numero1 = 0;
        int numero2 = 0;               
        
                
        
        System.out.println("Comparação de números");
        System.out.println("Informe o número 1");
        numero1 = input.nextInt();
        System.out.println("Informe o número 2");
        numero2 = input.nextInt();
        
        compararnumeros (numero1, numero2);
        
        
    }
    
    
    public static void compararnumeros (int numero1, int numero2){
    if (numero1 > numero2){
        System.out.println("O número 1 é maior que o número 2 ");
    }
    if (numero1 < numero2){
        System.out.println("O número 1 é menosr que o número 2 ");
    }
    else{ 
        
        System.out.println("Os dois números são iguais");
    }
       
    }
        
        
        
        
        
        
        
    }
    

