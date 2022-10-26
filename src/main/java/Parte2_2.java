
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2_2 {

    /**
     * @param args the command line arguments
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
                
        
        double mediadenota = calcularmedianota  (nota1, nota2, nota3);
        System.out.println ("A média é " + mediadenota);
        
    }
    
    public static double calcularmedianota (double nota1, double nota2, double nota3) {
            double mediadenota = (nota1 + nota2 +nota3);
            mediadenota = mediadenota/3;
            return mediadenota;
                    
    }
    

}
