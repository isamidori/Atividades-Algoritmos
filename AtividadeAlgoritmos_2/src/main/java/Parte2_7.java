
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numeromes = 0;
                
        System.out.println("Meses do ano");
        System.out.println("Informe o número do mês");
        numeromes = input.nextInt();
        
        nomedomes (numeromes);
    }
    
    public static void nomedomes (int numeromes){
        
        if (numeromes == 1){
            System.out.println("Janeiro");
        }
        
        else if (numeromes == 2){
            System.out.println("Fevereiro");
        }
        
        else if (numeromes == 3){
            System.out.println("Março");
        }
        else if (numeromes ==4){
            System.out.println("Abril");
        }
        else if (numeromes == 5){
            System.out.println("Maio");
        }
        else if (numeromes == 6){
            System.out.println("Junho");
        }
        else if (numeromes == 7){
            System.out.println("Julho");
        }
        else if (numeromes == 8){
            System.out.println("Agosto");
        }
        else if (numeromes == 9){
            System.out.println("Setembro");
        }
        else if (numeromes == 10){
            System.out.println("Outubro");
        }
        else if (numeromes == 11){
            System.out.println("Novembro");
        }
        else if (numeromes == 12){
            System.out.println("Dezembro");
        }
        else
            System.out.println("Informe um número de 1 a 12");
       
}







}