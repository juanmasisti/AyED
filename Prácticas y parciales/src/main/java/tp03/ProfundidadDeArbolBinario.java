package tp03;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> dato;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> dato) {
		this.dato = dato;
	}
	
	 public int sumaElementosProfundidad(int p) {
	        return sumaElementosProfundidadAux(dato, p, 0);
	    }

	    private int sumaElementosProfundidadAux(BinaryTree<Integer> dato, int p, int profundidadActual) {
	    	int sumaIzquierda = 0;
	    	int sumaDerecha = 0;
	        if (dato.isEmpty()) {
	            return 0;
	        }
	        if (profundidadActual == p) {
	            return dato.getData();
	        }
	        if (dato.hasLeftChild())
	        	 sumaIzquierda += sumaElementosProfundidadAux(dato.getLeftChild(), p, profundidadActual + 1);
	        if (dato.hasRightChild())
	        	sumaDerecha = sumaElementosProfundidadAux(dato.getRightChild(), p, profundidadActual + 1);
	        
	        return sumaIzquierda + sumaDerecha;
	    }
	    
	}

