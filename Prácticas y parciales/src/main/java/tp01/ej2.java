
package tp01;

import java.util.Scanner;

public class ej2 {
   
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo ");
        int n = s.nextInt();
        System.out.println("Arreglo con estructura for: ");
        array_multiplos.multiplos_n_A(n);
        System.out.println("Arreglo con estructura while: ");
        array_multiplos.multiplos_n_B(n);
        System.out.println("Arreglo con estructura recursiva: ");
        array_multiplos.multiplos_n_C(n);
    }
    
}
