
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2_3 {
 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
        
        System.out.println ("Calculo de média de nota");
        System.out.println ("Infome nota 1");
        double nota1 = input.nextInt ();
        System.out.println ("Informe nota 2");
        double nota2 = input.nextInt ();
        System.out.println ("Informe nota 3");
        double nota3 = input.nextInt ();
        System.out.println ("Informe a nota 4");
        double nota4 = input.nextInt();
        System.out.println("Informe a nota 5");
        double nota5 = input.nextInt();
                
        
        double mediadenota = calcularmedianota  (nota1, nota2, nota3, nota4, nota5);
        System.out.println ("A média é " + mediadenota);
        
    }
    
    public static double calcularmedianota (double nota1, double nota2, double nota3, double nota4, double nota5) {
            double mediadenota = (nota1 + nota2 + nota3 + nota4 + nota5);
            mediadenota = mediadenota/5;
            return mediadenota;
                    
    }
    

}
   

 
