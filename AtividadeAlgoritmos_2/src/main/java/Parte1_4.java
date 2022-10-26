
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
        String cor = "";
        
        
        System.out.println("Programa do semaforo");
        System.out.println("Qual cor está o semaforo?");
        cor = input.next();
        
        semaforo (cor);
    }
    
    public static void semaforo (String cor){
        if ("verde".equals(cor)){
        System.out.println("Atravesse");          
        }
        
        else if ("vermelho".equals(cor)){
            System.out.println("Espere");
        }
        
        else 
            System.out.println("Farol inoperante");
    }
    
}
