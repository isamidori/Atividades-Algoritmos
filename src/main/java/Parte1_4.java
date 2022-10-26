
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Area do quadrado");
        System.out.println ("Informe um número");
        int n = input.nextInt();
        
        int x = ladovezeslado (n);
        
        System.out.println ("A area do quadrado é" + x);
        
    }
    
    public static int ladovezeslado (int numero){
        int d = numero * numero;
        return d;
                
        
    }
    
}
