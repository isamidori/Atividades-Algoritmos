
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


// Implementar uma função que calcule o total a se pagar em uma compra na sorveteria, a partir do total de gramas comprado. O preço de 100g é R$ 3,50 mas se o total de gramas for maior que 1kg, o preço de 100g diminui 50 centavos
/**
 *
 * @author isabe
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double gramas = 0.0;
        double cemg = 0.035;
        double desc = 0.03;
        
        
        System.out.println("Programa do sorvete");
        System.out.println("Informe quantas gramas você comprou");
        gramas = input.nextInt();
        
        double primcalculo = calculograma (gramas, cemg, desc);
        System.out.println("O valor final é " + primcalculo);
        
        double segcalculo = calculograma (gramas, cemg, desc);
        System.out.println("O valor final é " + segcalculo);
        
        
    }
    
    
    public static double calculograma (double gramas, double cemg, double desc){
        
        if ((gramas < 1000) || (gramas == 1000)) {
        double primcalculo = gramas * cemg;
        return primcalculo;
        
        }
        
        else if (gramas > 1000){
        double segcalculo = gramas * desc;
        return segcalculo;
        }
        return 0;
       
       
    }
    
}
        