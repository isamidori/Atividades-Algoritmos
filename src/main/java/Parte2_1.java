
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Calculo do Octogono regular");
        System.out.println("Informe o lado");
        int lado = input.nextInt();
        System.out.println("Informe a altura");
        int altura = input.nextInt();
    
        double areadooctogono = calculareaoctogono (lado, altura);
        System.out.println ("A area do octogono é: "+ areadooctogono);
              
     }
    
    
    public static double calculareaoctogono (int lado, int altura){
        double areadooctogono = lado * altura;        
        areadooctogono = areadooctogono * 4;
        return areadooctogono;
               
        
    }
    
}
