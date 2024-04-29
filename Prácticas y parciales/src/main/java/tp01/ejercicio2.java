package tp01;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
	
	public static int[] obtenerMultiplos(int n) {
		int[] multiplos = new int[n];
		for (int i=0;i<n;i++) {
			multiplos[i] = n * (i + 1);
		}
		return multiplos;
		
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        int[] multiplos = obtenerMultiplos(numero);
        
        System.out.println("Array de tamaño n de los multiplos n correspondientes");
        System.out.println(Arrays.toString(multiplos));

	}
}
