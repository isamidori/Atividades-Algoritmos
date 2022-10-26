
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String cor = "";
        
        
        System.out.println("Semaforo");
        System.out.println("Infome se está vermelho ou verde");
        cor = input.next();          

            
    if ("vermelho".equals(cor)){
    System.out.println ("Você não pode atravessar");
    }
    
    else if ("verde".equals(cor)){
    System.out.println ("Você pode atravessar");    
    
    } else {
    System.out.println("Informe uma cor válida");
    
    }
    
    }
}
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

 
    
    

