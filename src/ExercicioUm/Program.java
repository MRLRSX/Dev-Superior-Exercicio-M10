package ExercicioUm;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;



public class Program {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int position = 0;
        try {
        String[] vect = entrada.nextLine().split(" ");
        position = entrada.nextInt();
        
        System.out.println(vect[position]);
        }catch(ArrayIndexOutOfBoundsException error) {
        	System.out.printf("POSIÇÃO INVALIDA %d\n", position);
        }catch(InputMismatchException error2) {
        	System.out.printf("ENTRADA INVALIDA \n");        	
        }
        entrada.close();
	}
}
