import java.util.Scanner;

public class Parte3_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int array[] = new int[] {1, 2, 3, 4, 5};

		System.out.println("Retorna dobro");
	
		int verFinal[] = verArray (array);
		for(int counter:verFinal) {
		System.out.println(counter);
		}
	}
	
	public static int[] verArray (int array[]) {

		
		for(int counter = 0 ; counter < array.length; counter ++) {
			array[counter] = array[counter] * 2;
			
		}
		
		return array;
	}

}
	

