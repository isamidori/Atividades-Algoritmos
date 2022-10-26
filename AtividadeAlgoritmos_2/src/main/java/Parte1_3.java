
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Parte1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        
        System.out.println("Verificar 3 números");
        System.out.println("Informe o número 1");
        numero1 = input.nextInt ();
        System.out.println("Informe o número 2");
        numero2 = input.nextInt ();
        System.out.println("Informe o número 3");
        numero3 = input.nextInt();
        
        compararnumeros (numero1, numero2, numero3);
    }
    
    public static void compararnumeros (int numero1, int numero2, int numero3){
        if ((numero1 > numero2) && (numero1 > numero3)){
            System.out.println("O número 1 é maior que o número 2 e 3");
    }
        if ((numero2 > numero1) && (numero2 > numero3)){
        System.out.println("O numero 2 é maior que o numero 1 e 3");
    }
        if ((numero3 > numero1) && (numero3 > numero2)){
        System.out.println("O número 3 é maior que o numero1 e 2");
    }
        if ((numero1 == numero2) && (numero2 == numero3)){
        System.out.println("Os números são iguais");
    }
    }
        
    }
    

