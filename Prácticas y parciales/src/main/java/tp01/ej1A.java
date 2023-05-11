/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01;

import java.util.Scanner;
import tp01.incisos;

public class ej1A {
    
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = s.nextInt();
        System.out.println("Ingrese otro numero");
        int b = s.nextInt();
        System.out.println("Con estructura for: ");
        incisos.imprimir_rango_A(a, b);
        System.out.println("Con estructura while");
        incisos.imprimir_rango_B(a, b);
        System.out.println("Con recursion");
        incisos.imprimir_rango_C(a, b);
    }
    
}
