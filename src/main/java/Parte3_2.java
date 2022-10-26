
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Comparação de retangulos");
        System.out.println("Informe base do retangulo 1");
        int base1 = input.nextInt ();
        System.out.println ("Informe altura do retangulo 1");
        int altura1 = input.nextInt ();
        
        
        System.out.println ("Informe a base do retangulo 2");
        int base2 = input.nextInt ();
        System.out.println("Informe a altura do retangulo 2");
        int altura2 = input.nextInt();
        
        
        int arearetangulo1 = calculoretangulo (base1, altura1);
        System.out.println ("A area do retangulo 1 é: " + arearetangulo1);
        
        int arearetangulo2 = calculoretangulo (base2, altura2);        
        System.out.println("A area do retangulo 2 é: +" + arearetangulo2);   
        
        
        if (arearetangulo1 > arearetangulo2) {
            System.out.println ("O retangulo 1 é maior que o 2");
            
        } else {
            System.out.println("O retangulo 2 é maior que o 1");
        }
        
    }
        
        public static int calculoretangulo (int base, int altura){
            int calculoretangulo = (base * altura);
            return calculoretangulo;
        }
        
                
    
    
    
}
