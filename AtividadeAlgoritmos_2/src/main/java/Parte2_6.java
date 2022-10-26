
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numerodia = 0;
        
        
        System.out.println("Dias da semana");
        System.out.println("Informe o número do dia");
        numerodia = input.nextInt();
        
        verificardia (numerodia);
    }
    
    public static void verificardia (int numerodia){
        if (numerodia == 0){
            System.out.println("Domingo");
        }
        
        else if (numerodia == 1){
            System.out.println("Segunda");
       
        }
        else if (numerodia == 2){
            System.out.println("Terça");
            
        }
        else if (numerodia == 3){
            System.out.println("Quarta");
        }
        else if (numerodia == 4){
            System.out.println("Quinta");
        }
        else if (numerodia == 5){
            System.out.println("Sexta");            
        }
        else if (numerodia == 6){
            System.out.println("Sábado");            
        }
        else 
            System.out.println("Dia da semana invalido");
        }
}
    
