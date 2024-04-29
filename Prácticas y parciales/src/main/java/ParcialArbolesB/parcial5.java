package ParcialArbolesB;

import tp02.ColaGenerica;
import tp03.BinaryTree;

public class parcial5 {
	private BinaryTree<Integer> arbol;
	
	public parcial5 (BinaryTree<Integer> arbol) {
	this.arbol = arbol;
	}
	
	public BinaryTree<Integer> minEnNivelDeAB (int n){
		if (arbol.isEmpty())
			return null;
		else {
			ColaGenerica<BinaryTree<Integer>> cola = new ColaGenerica<BinaryTree<Integer>>();
			BinaryTree<Integer> aux;
			
			cola.encolar(arbol);
			cola.encolar(null);
			
			int nivel = 0;
			int min = 9999;
			
			BinaryTree<Integer> minArbol = null;
			
			while ((!cola.esVacia()) && (nivel <= n)) {
				aux = cola.desencolar();
				if (aux != null) {
					if ((nivel ==n)&&(aux.isLeaf())&& (aux.getData() < min)) {
						min = aux.getData();
						minArbol = aux;
					}
					if (aux.hasLeftChild())
						cola.encolar(aux.getLeftChild());
					if (aux.hasRightChild())
						cola.encolar(aux.getRightChild());
				}
				else 
					if (!cola.esVacia()) {
						cola.encolar(null);
						nivel++;
					}
			}
			return minArbol;

		}
	}

}

