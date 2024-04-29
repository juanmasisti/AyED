package ParcialArbolesB;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;
import tp03.BinaryTree;

public class parcialpIII {
	public ListaGenerica<Integer> resolver(BinaryTree<Integer> arbol){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		resolver(arbol,l);
		return l;
	}
	
	private Integer resolver(BinaryTree<Integer> a, ListaGenerica<Integer> l) {
		int cant = 0;
		
		if ((a.hasLeftChild() && (a.hasRightChild()) && (a.getData() % 2 == 0) )) {
			l.agregarFinal(a.getData());
			resolver(a.getLeftChild());
			resolver(a.getRightChild());
			return cant + 1;
		}
		else {
			if (a.hasLeftChild())
				resolver(a.getLeftChild());
			if (a.hasRightChild())
				resolver(a.getRightChild());
			return cant;
		}
	}
}


