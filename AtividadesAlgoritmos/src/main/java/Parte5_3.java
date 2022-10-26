
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println ("Programa do Triangulo");
            System.out.println ("Informe a medida do lado 1");
            int medida1 = input.nextInt();
            System.out.println("Informe a medida do lado 2");
            int medida2 = input.nextInt();
            System.out.println ("Informe a medida do lado 3");
            int medida3 = input.nextInt();
            
    if ((medida1 == medida2) && (medida2 == medida3) && (medida3 == medida1)) {
        System.out.println("É um triangulo equilátero");
        
    }
    
    
    else {
    System.out.println ("Não é um triangulo");
                
        
        
        
    }
    
            
            
                    
    }
    
}
