/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp01;

public class array_multiplos {
    static int i = 0;
    static int aux =1;
    static int[] array;
    
     public static void multiplos_n_A(int n){
        array = new int[n];
        for (i=0; i<n; i++)
            array[i] = n;
        for (i=0; i<n ; i++)
            array[i] = n*(i+1);
        for (i=0; i<n ; i++)
            System.out.println(array[i]);
    }
     
   public static void multiplos_n_B(int n){
        i = 0;
        aux =1;
        array = new int[n];
        while (i<n){
            array[i] = n;
            array[i] = n*(i+1);
            System.out.println(array[i]);
            i++;
        }
    }
    
   public static void multiplos_n_C(int n){
        array = new int[n];
        if (i<n){
            array[i] = n*aux++;
            System.out.println(array[i]);
            i++;
            multiplos_n_C(n);
        }
    }
}
