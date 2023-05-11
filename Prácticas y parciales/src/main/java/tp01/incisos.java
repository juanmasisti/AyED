
package tp01;


public class incisos {
    
    
    public static void imprimir_rango_A(int a, int b){
        if (a<b)
            for (int i=a; i<=b; i++){
                System.out.println(i);
            }
        else
        if (a>b)
            for (int i = b; i <= a; i++){
                System.out.println(i);
            }
        else
            System.out.println(a);
    }
    
    public static void  imprimir_rango_B(int a, int b){
        int i;
        if (a<b){
            i = a;
            while (i<=b){
                System.out.println(i);
                i++;
            }
        }
        else
        if (a>b){
            i = b;
            while (i<=a){
                System.out.println(i);
                i++;
            }
        }
        else
            System.out.println(a);
    }
    
    public static void  imprimir_rango_C(int a, int b){
        System.out.println(a);
        if (a<b)
            imprimir_rango_C(a+1,b);
    }
}
