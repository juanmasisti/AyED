package tp01;

public class ejercicio1 {

	public static void imprimirEntreConFor(int a,int b) {
		for (int i = a;i <= b; i++) {
			System.out.println(i);
		}
	}
	
	public static void imprimirEntreConWhile(int a, int b) {
		while (a<=b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void imprimirEntreConRecursion(int a, int b) {
		if (a<=b) {
			System.out.println(a);
			imprimirEntreConRecursion(a+1, b);
		}
	}
	
	public static void main(String[] args) {
        int inicio = 1;
        int fin = 10;

        System.out.println("Con for:");
        imprimirEntreConFor(inicio, fin);

        System.out.println("Con while:");
        imprimirEntreConWhile(inicio, fin);

        System.out.println("Sin iterativas:");
        imprimirEntreConRecursion(inicio, fin);
    }
}
