
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     
     System.out.println ("Calculo do retangulo");
     System.out.println ("Informe a base");
     int base = input.nextInt ();
     System.out.println ("Informe a altura");
     int altura = input.nextInt ();
    
    int areadoretangulo = areadoretangulo (base, altura);
    
     
    System.out.println("A area do retangulo é:" + areadoretangulo);
    
    }
    
    public static int areadoretangulo (int base, int altura)
    {
    
        int basevezesaltura = base * altura;
        return basevezesaltura;
    
    }
    
    
    
    
    
     
     
    }
    

