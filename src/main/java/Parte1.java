
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.println("Programa de Dobro");
        
        System.out.println("Informe um número");
        int n = input.nextInt();
        
        int x = dobro (n);
        System.out.println("O dobro é: " + x);
       
    }

    public static int dobro(int numero) {
        int d = numero * 2;
        return d;
        
    }
        
    }
    
    
    
    
    
    

