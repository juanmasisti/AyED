/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01;

public class ej4 {
    public static void swap1 (int x, int y) {
    if (x < y) {
    int tmp = x ;
    x = y ;
    y = tmp;
                }
    }
 public static void swap2 (Integer x, Integer y) {
 if (x < y) {
 int tmp = x ;
 x = y ;
 y = tmp;
}
 
 }
 public static void main(String[] args) {
int a = 1, b = 2;
Integer c = 3, d = 4;
swap1(a,b);
swap2(c,d);
System.out.println("a=" + a + " b=" + b) ;
System.out.println("c=" + c + " d=" + d) ;
 }
}

    

