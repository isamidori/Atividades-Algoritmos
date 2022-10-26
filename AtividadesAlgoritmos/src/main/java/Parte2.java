
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Calculo do triangulo");
        System.out.println("Informe a base");
        int base = input.nextInt();
        System.out.println("Informe a altura");
        int altura = input.nextInt();
    
        double areadotriangulo = calculareatriangulo (base, altura);
        System.out.println ("A area do triangulo é: " + areadotriangulo);
              
     }
    
    
    public static double calculareatriangulo(int base, int altura){
        double areadotriangulo = base * altura;        
        areadotriangulo = areadotriangulo / 2;
        return areadotriangulo;
               
        
    }
    
}
