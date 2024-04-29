package ParcialArbolesB;

import tp02.ColaGenerica;
import tp03.BinaryTree;

public class parcial4 {
	public Boolean esArbolCreciente(BinaryTree<Integer> arbol) {
		if (arbol.isEmpty())
			return false;
		else {
			ColaGenerica<BinaryTree<Integer>> cola = new ColaGenerica<BinaryTree<Integer>>();
			BinaryTree<Integer> aux;
			
			cola.encolar(arbol);
			cola.encolar(null);
			
			Boolean ok = true;
			int cant = 0;
			int nivel = 0;
			while ((!cola.esVacia())&& (ok)) {
				aux = cola.desencolar();
				if (aux != null) {
					cant++;
					if (aux.hasLeftChild())
						cola.encolar(aux.getLeftChild());
					if (aux.hasRightChild())
						cola.encolar(aux.getRightChild());
				}
				else {
					if (cant != nivel + 1)
						ok = false;
					if (!cola.esVacia()) {
						cola.encolar(null);
						nivel++;
						cant = 0;
					}
				}
			}
			return ok;
		}
		
	}

}

