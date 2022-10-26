
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Comparação de quadrados");
        System.out.println("Informe lado 1 do quadrado 1");
        int lado1Q1 = input.nextInt ();
        System.out.println ("Informe lado 1 do quadrado 2");
        int lado1Q2 = input.nextInt ();
        
        int areaquadrado1 = calculoquadrado (lado1Q1);
        System.out.println ("A area do quadrado 1 é: " + areaquadrado1);
        
        int areaquadrado2 = calculoquadrado (lado1Q2);        
        System.out.println("A area do quadrado 2 é: +" + areaquadrado2);   
        
        
        if (areaquadrado1 > areaquadrado2) {
            System.out.println ("O quadrado 1 é maior que o 2");
            
        } else {
            System.out.println("O quadrado 2 é maior que o 1");
        }
        
    }
        
        public static int calculoquadrado (int lado){
            int calculoquadrado = (lado * lado);
            return calculoquadrado;
        }
        
                
    
    
    
}
