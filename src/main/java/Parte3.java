
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte3 {
    
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
        verificaaprovacao (mediadenota);
               
        
        
    }
    
    public static double calcularmedianota (double nota1, double nota2, double nota3) {
            double mediadenota = (nota1 + nota2 + nota3);
            mediadenota = mediadenota/3;
            return mediadenota;
                               
    }
    
    public static void verificaaprovacao (double mediadenota) {
            if (mediadenota >= 5) {
                System.out.println ("Aprovado");
                       
            } else {
                System.out.println ("Reprovado");
            } 
    }
    
}

