
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Comparação de triangulos");
        System.out.println("Informe base do triangulo 1");
        int base1 = input.nextInt ();
        System.out.println ("Informe altura do triangulo 1");
        int altura1 = input.nextInt ();
        
        
        System.out.println ("Informe a base do triangulo 2");
        int base2 = input.nextInt ();
        System.out.println("Informe a altura do triangulo 2");
        int altura2 = input.nextInt();
        System.out.println("Informe a base do triangulo 3");
        int base3 = input.nextInt();
        System.out.println ("Informe a altura do triangulo 3");
        int altura3 = input.nextInt();
        
        
        int areatriangulo1 = calculotriangulo (base1, altura1);
        System.out.println ("A area do triangulo 1 é: " + areatriangulo1);
        
        int areatriangulo2 = calculotriangulo (base2, altura2);        
        System.out.println("A area do triangulo 2 é: " + areatriangulo2);   
        
        int areatriangulo3 = calculotriangulo (base3, altura3);
        System.out.println("A area do triangulo 3 é: " + areatriangulo3);
       
        
        if (areatriangulo1 > areatriangulo2) {
            System.out.println ("O triangulo 1 é maior que o 2");
            
        }else if (areatriangulo2 > areatriangulo1){
            System.out.println ("O triangulo 2 é maior que o 1");
        
        }else if (areatriangulo1 > areatriangulo3){
            System.out.println ("O triangulo 1 é maior que o 3");
           
            
        }else if (areatriangulo3 > areatriangulo1){
                System.out.println ("O triangulo 3 é maior que o 1");
        
            
}
            
            
    }
        
        public static int calculotriangulo (int base, int altura){
            int calculotriangulo = (base * altura);
            calculotriangulo = calculotriangulo / 2;
            return calculotriangulo;
        }
        
                
    
    
    
}
