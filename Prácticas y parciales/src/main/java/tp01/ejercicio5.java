package tp01;

public class ejercicio5 {
	
	public static String calcularArreglo1(){
		int[] arreglo = new int[3];
		arreglo[0] = 1;
		arreglo[1] = 2;
		arreglo[2] = 3;
		
		int max = 0;
		int min = 9999;
		double prom = 0;
		int cant = 0;
		
		for (int num : arreglo) {
			cant++;
			prom += num;
			if (num>max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
		}
		
		return "Arreglo1: " + "\n" +
			   "Max: " + max + "\n" +
			   "Min: " + min + "\n" +
			   "prom: " + prom/cant + "\n";
	}
	

	public static String calcularArreglo2(int num1,int num2,int num3){
		int[] arreglo = new int[3];
		arreglo[0] = num1;
		arreglo[1] = num2;
		arreglo[2] = num3;
		
		int max = 0;
		int min = 9999;
		double prom = 0;
		int cant = 0;
		
		for (int num : arreglo) {
			cant++;
			prom += num;
			if (num>max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
		}
		
		return "Arreglo2: " + "\n" +
			   "Max: " + max + "\n" +
			   "Min: " + min + "\n" +
			   "prom: " + prom/cant + "\n";
	}
	
	public static void calcularArreglo3(){
		int[] arreglo = new int[3];
		arreglo[0] = 2;
		arreglo[1] = 4;
		arreglo[2] = 6;
		
		int max = 0;
		int min = 9999;
		double prom = 0;
		int cant = 0;
		
		for (int num : arreglo) {
			cant++;
			prom += num;
			if (num>max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
		}
		
		System.out.print("Arreglo3: " + "\n" +
				   "Max: " + max + "\n" +
				   "Min: " + min + "\n" +
				   "prom: " + prom/cant + "\n");
	}
	public static void main(String[] args) {
		System.out.println(calcularArreglo1());
		System.out.println(calcularArreglo2(5,10,15));
		calcularArreglo3();
	}
}
