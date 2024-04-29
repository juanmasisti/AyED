package ParcialArbolesB;

import tp02.ColaGenerica;
import tp03.BinaryTree;

public class parcial3 {
	public void colorearArbol(BinaryTree<String> arbol, Integer maxColor) {
		ColaGenerica<BinaryTree<String>> cola = new ColaGenerica<BinaryTree<String>>();
		BinaryTree<String> aux;
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		String color = "negro";
		
		int cantidad = 0;
		
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) {
				cantidad++;
				if (cantidad > maxColor)
					aux.setData("verde");
				else
					aux.setData(color);
				if (aux.hasLeftChild())
					cola.encolar(aux.getLeftChild());
				if (aux.hasRightChild())
					cola.encolar(aux.getRightChild());
			}
			else
				if (!cola.esVacia()) {
					cola.encolar(null);
					cantidad = 0;
					if (color.equals("negro"))
						color = "rojo";
					else
						if (color.equals("rojo"))
							color = "negro";
				}
		}
	}

}

