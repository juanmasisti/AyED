package tp01;

import java.util.ArrayList;

public class TestArrayList {
	
	    public static void main(String[] args) {
	        ArrayList<Integer> numeros = new ArrayList<>();
	        for (String arg : args) {
	            numeros.add(Integer.parseInt(arg));
	        }

	        System.out.println("Contenido de la lista:");
	        for (Integer num : numeros) {
	            System.out.println(num);
	        }
	    }
}


