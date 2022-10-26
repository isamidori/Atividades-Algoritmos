
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Scanner input = new Scanner (System.in);
        
        System.out.println ("programa da metade");
        System.out.println("Informe um numero");
        int n = input.nextInt();
        
        int x = metade (n);
        System.out.println("A area do quadrado é: " + x);
    }
        
    public static int metade (int numero) {
        int d = numero / 2;
        return d;
    }
    
}
